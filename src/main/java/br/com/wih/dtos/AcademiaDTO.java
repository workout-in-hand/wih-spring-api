package br.com.wih.dtos;

import java.util.Date;

public class AcademiaDTO {

    private String id;

    private String nome;

    private Boolean ativo;

    private String responsavel;

    private Date dataCriacao;

    private Date dataAlteracao;

    public AcademiaDTO() {}
    
	public AcademiaDTO(String id, String nome, Boolean ativo, String responsavel, Date dataCriacao,
			Date dataAlteracao) {
		super();
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
		this.responsavel = responsavel;
		this.dataCriacao = dataCriacao;
		this.dataAlteracao = dataAlteracao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

    
    
}
