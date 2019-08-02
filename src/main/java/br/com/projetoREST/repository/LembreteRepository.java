package br.com.projetoREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Lembrete;

@Repository
public interface LembreteRepository extends JpaRepository<Lembrete,Long>{

	

}
