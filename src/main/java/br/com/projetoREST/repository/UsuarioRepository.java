package br.com.projetoREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
	//Retorna o usuario correspondente as informações de Login
	
		@Query("SELECT usuario FROM Usuario usuario "
				+ "WHERE usuario.login is :usuario "
				+ "and usuario.senha is :senha and usuario.tipo_usuario = '1'")
		public Usuario verificarUsuarioSenha(@Param("usuario") String usuario, @Param("senha") String senha);
	
		@Query("SELECT usuario FROM Usuario usuario "
				+ "WHERE usuario.login is :usuario "
				+ "and usuario.senha is :senha and usuario.tipo_usuario = '2'")
		public Usuario verificarUsuarioSenhaPaciente(@Param("usuario") String usuario, @Param("senha") String senha);
}
