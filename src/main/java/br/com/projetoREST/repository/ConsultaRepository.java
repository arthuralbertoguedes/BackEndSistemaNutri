package br.com.projetoREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
	
	
}
