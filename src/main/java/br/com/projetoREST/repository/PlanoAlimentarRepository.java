package br.com.projetoREST.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.projetoREST.model.PlanoAlimentar;

public interface PlanoAlimentarRepository extends JpaRepository<PlanoAlimentar, Long> {
	
	
	@Query(value = "select bean from PlanoAlimentar bean where bean.paciente_id = :idPaciente order by bean.data_horario_cadastro DESC")	
	public List<PlanoAlimentar> buscarPorPaciente(@Param("idPaciente") Long idPaciente);
}
