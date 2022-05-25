package br.com.wih.dtos;

import java.util.Date;

import br.com.wih.entities.Usuario;

public class UsuarioDTO {
	private String id;

	private String nome;

	private String email;

	private Boolean ativo;

	private Integer idTipoUsuario;

	private String idAcademia;

	private Date dataCriacao;

	private Date dataAlteracao;

	public UsuarioDTO() {
	}

	public UsuarioDTO(String id, String nome, String email, Boolean ativo, Integer idTipoUsuario, String idAcademia,
			Date dataCriacao, Date dataAlteracao) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.ativo = ativo;
		this.idTipoUsuario = idTipoUsuario;
		this.idAcademia = idAcademia;
		this.dataCriacao = dataCriacao;
		this.dataAlteracao = dataAlteracao;
	}

	public UsuarioDTO(Usuario entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.email = entity.getEmail();
		this.ativo = entity.getAtivo();
		this.idTipoUsuario = entity.getTipoUsuario().getId();
		this.idAcademia = entity.getAcademia().getId();
		this.dataCriacao = entity.getDataCriacao();
		this.dataAlteracao = entity.getDataAlteracao();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(Integer idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getIdAcademia() {
		return idAcademia;
	}

	public void setIdAcademia(String idAcademia) {
		this.idAcademia = idAcademia;
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

	@Override
	public String toString() {
		return "Usuario{" + "nome='" + nome + '\'' + ", email='" + email + '\'' + ", ativo=" + ativo + '}';
	}
}
