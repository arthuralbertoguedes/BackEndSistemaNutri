package br.com.projetoREST.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Mensagem;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem,Long>{

	@Query(value = "SELECT mensagem from Mensagem mensagem "
			+ 	   "inner join mensagem.usuario usuario "
			+ 	   "inner join mensagem.paciente paciente "
			+ 	   " where usuario.id = :idNutricionista and "
			+      " paciente.id = :idPaciente "
			+ 	   " order by mensagem.horario ")
	public List<Mensagem> buscarMensagens(@Param("idPaciente") Long idPaciente, @Param("idNutricionista") Long idNutricionista);
}
