package br.com.projetoREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Mensagem;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem,Long>{

}
