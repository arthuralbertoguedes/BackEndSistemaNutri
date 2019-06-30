package br.com.projetoREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoREST.model.Antropometria;


@Repository
public interface AntropometriaRepository extends JpaRepository<Antropometria, Long>{

}
