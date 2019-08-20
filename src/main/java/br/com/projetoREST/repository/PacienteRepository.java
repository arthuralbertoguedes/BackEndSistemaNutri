package br.com.projetoREST.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
	
	@Query(value = "Select * from paciente where paciente.nome ILIKE :nomePaciente LIMIT 12", nativeQuery = true)
	public List<Paciente> findByNome(String nomePaciente);
	
	@Query(value = "Select bean from Paciente bean "
			+ "		order by bean.dataCadastro DESC")
	public List<Paciente> listarUltimosCadastrados(Pageable pageable);
}
