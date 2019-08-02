package br.com.danielfarias.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.danielfarias.teste.dao.ProcedimentoDao;
import br.com.danielfarias.teste.model.ProcedimentoRevisao;

@RestController
@RequestMapping("/procedimentos")
public class ProcedimentoController {
	
	@Autowired
	private ProcedimentoDao procedimentoDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<ProcedimentoRevisao> list() {
		return procedimentoDao.findAll();
	}

}
