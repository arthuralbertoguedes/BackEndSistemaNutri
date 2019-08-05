package br.com.projetoREST.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Lembrete;

@Repository
public interface LembreteRepository extends JpaRepository<Lembrete,Long>{

	@Query(value="select bean from Lembrete bean where bean.dataLembrete = :data")
	public List<Lembrete> buscarLembretesHoje(@Param("data") LocalDate data);

}
