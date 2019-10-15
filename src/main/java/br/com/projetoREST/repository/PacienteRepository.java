package br.com.projetoREST.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
	
	@Query(value = "Select * from paciente where paciente.nome ILIKE :nomePaciente LIMIT 12", nativeQuery = true)
	public List<Paciente> findByNome(@Param("nomePaciente") String nomePaciente);
	
	@Query(value = "Select bean from Paciente bean "
			+ "		order by bean.dataCadastro DESC")
	public List<Paciente> listarUltimosCadastrados(Pageable pageable);
	
	@Query(value = "Select bean from Paciente bean"
			+ 		" inner join bean.usuario usuario "
			+ "		where usuario.id = :id")
	public  Optional<Paciente> listarPorUsuarioId(@Param("id") Long id);
}
