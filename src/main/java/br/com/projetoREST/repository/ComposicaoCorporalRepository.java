package br.com.projetoREST.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.projetoREST.model.ComposicaoCorporal;

public interface ComposicaoCorporalRepository extends JpaRepository<ComposicaoCorporal,Long>{

	
	@Query(value="select bean from ComposicaoCorporal bean"
			+ "	  where bean.paciente.id = :id")
	public Optional<ComposicaoCorporal> buscarComposicaoCorporalPorIdPaciente(@Param("id") Long id);
}
