package br.com.projetoREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Alimento;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Long>{

	
	@Query(value = "select * from alimento where alimento.descricao like :pesquisa LIMIT 10"
				, nativeQuery = true)
	public Alimento[] listarPorNome(@Param("pesquisa") String pesquisa);
	
}
