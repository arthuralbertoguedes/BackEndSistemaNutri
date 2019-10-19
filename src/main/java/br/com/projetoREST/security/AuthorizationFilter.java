package br.com.projetoREST.security;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;

@Component
@Order(2)
public class AuthorizationFilter implements Filter {

	private String endpointAutenticacao = "/logar/autenticar";
	
	private String endpointCadastrarUsuario = "/usuario/salvar";
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
//
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req  = (HttpServletRequest)request;
	    HttpServletResponse res = (HttpServletResponse) response;
		
		//Se a requisição quiser realizar o Login, reencaminha para o Login Controller 
		if(req.getRequestURI().equals(this.endpointAutenticacao)) {
			req.getRequestDispatcher(this.endpointAutenticacao).forward(request, response);
			return;	
		}
		
		//Endpoint para cadastrar novo Usuário deve ser liberado 
		if(req.getRequestURI().equals(this.endpointCadastrarUsuario)) {
			req.getRequestDispatcher(this.endpointCadastrarUsuario).forward(request, response);
			return;	
		}
		
		
		//Para qualquer requisição com destino a outro end_point 
		else {
			//Verifica Se o header com a autorização existe
			if(req.getHeader("Authorization") != null) {			
				if(req.getHeader("Authorization").substring(0,7).equals("Bearer ")) {
					
					String token = req.getHeader("Authorization").substring(7);
					
					/*Verifica se o token é válido
					* Se sim, libera o acesso para o respectivo end point
					* senão, lança exceção e bloqueia o acesso */
					try {
						
						Jwts.parser().setSigningKey("NSI245@483SK38S9K4Slo29l").parse(token).getBody();						
						chain.doFilter(request, response);
						return;
					}
					//Em caso de token inválido
					catch(SignatureException e) {
					
						throw new SignatureException("Acesso negado");
					}
					//Em caso de chave secreta inválida
					catch(IllegalArgumentException ex) {
					
						throw new IllegalArgumentException("Acesso negado");
					}
					
					/* Caso o token tenha expirado
					 * será retornado Status 401 
					 * O Front vai tratar esse erro e solicitar
					 * um novo token atualizado passando o id do usuário
					 */
					catch(ExpiredJwtException ex) {		
						res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);					
					}
				}
			}
			//Caso não tenha o header de autorização na requisição HTTP
			throw new ServletException("Acesso negado");
		}		
		
	}

	@Override
	public void destroy() {}
//
//			spring.h2.console.enabled=true
//			spring.h2.console.path=/h2
//			spring.jpa.hibernate.ddl-auto=update
//			spring.datasource.url=jdbc:h2/nutri_db
//			spring.jpa.show-sql=true
//			spring.jpa.properties.hibernate.format_sql=true
//			spring.datasource.url=jdbc:h2:file:/C:/TCC/db
//			spring.datasource.driverClassName=org.h2.Driver
//			spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
//			spring.datasource.username=sa
//			spring.datasource.password=

}
