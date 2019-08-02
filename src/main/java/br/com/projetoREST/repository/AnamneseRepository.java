package br.com.projetoREST.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Anamnese;
@Repository
public interface AnamneseRepository extends JpaRepository<Anamnese,Long>{

	 @Query(value = "SELECT bean from Anamnese bean where bean.paciente.id = :id")
	 public Optional<Anamnese> buscarPorPacienteId(@Param("id") Long id);
	

}
