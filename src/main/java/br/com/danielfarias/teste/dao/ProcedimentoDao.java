package br.com.danielfarias.teste.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.danielfarias.teste.model.ProcedimentoRevisao;


@Repository
public interface ProcedimentoDao extends JpaRepository<ProcedimentoRevisao, Long>{

}
