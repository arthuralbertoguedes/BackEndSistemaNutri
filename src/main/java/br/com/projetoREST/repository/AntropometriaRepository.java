package br.com.projetoREST.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Antropometria;


@Repository
public interface AntropometriaRepository extends JpaRepository<Antropometria, Long>{

	@Query(value=" select antropometria from Antropometria antropometria"
			+ "		where antropometria.paciente.id = :id")
	public Optional<Antropometria> buscarPorIdPaciente(@Param("id") Long id);
	
}
