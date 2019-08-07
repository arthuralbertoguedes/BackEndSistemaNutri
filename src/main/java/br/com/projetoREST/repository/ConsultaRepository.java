package br.com.projetoREST.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{
	
	@Query(value = "select * from consulta " + 
					"inner join paciente " + 
					"on (consulta.paciente_id = paciente.id) " + 
					" where paciente.nome ilike :nomePaciente ", nativeQuery = true)
	public List<Consulta> buscarPorNomePaciente(@Param("nomePaciente") String nome);

}
