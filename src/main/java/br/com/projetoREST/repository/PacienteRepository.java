package br.com.projetoREST.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Pessoa;

@Repository
public interface PacienteRepository extends JpaRepository<Pessoa, Long> {
	
	@Query(value = "Select * from pessoa where pessoa.nome ILIKE :nomePaciente", nativeQuery = true)
	public List<Pessoa> findByNome(String nomePaciente);
	
}
