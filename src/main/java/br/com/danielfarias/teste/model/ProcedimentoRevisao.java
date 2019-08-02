package br.com.danielfarias.teste.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_procedimento_revisao", schema = "HUMASTER")
public class ProcedimentoRevisao implements Serializable{
	
	private static final long serialVersionUID = -7298962500030396757L;
	
	@Id
	@Column (name = "nu_revisao")
	private Long nuRevisao;

	@Column(name = "nu_procedimento")
	private String nuProcedimento;
	
	@Column(name = "nm_procedimento")
	private String nmProcedimento;

	public Long getNuRevisao() {
		return nuRevisao;
	}

	public void setNuRevisao(Long nuRevisao) {
		this.nuRevisao = nuRevisao;
	}

	public String getNuProcedimento() {
		return nuProcedimento;
	}

	public void setNuProcedimento(String nuProcedimento) {
		this.nuProcedimento = nuProcedimento;
	}

	public String getNmProcedimento() {
		return nmProcedimento;
	}

	public void setNmProcedimento(String nmProcedimento) {
		this.nmProcedimento = nmProcedimento;
	}
}
