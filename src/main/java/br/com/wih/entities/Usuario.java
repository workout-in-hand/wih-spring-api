package br.com.wih.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "usuario", schema = "public")
public class Usuario {

	@Id
	private String id;

	@NotEmpty(message = "Nome não pode ser vazio")
	private String nome;

	private String email;

	@NotEmpty(message = "Senha não pode ser vazia")
	private String senha;

	private Boolean ativo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_usuario")
	private TipoUsuario tipoUsuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_academia")
	private Academia academia;

	private Date dataCriacao;

	private Date dataAlteracao;

	public Usuario() {
	}

	public Usuario(String nome, String email, String senha, Boolean ativo, TipoUsuario tipoUsuario, Academia academia,
			Date dataCriacao, Date dataAlteracao) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.ativo = ativo;
		this.tipoUsuario = tipoUsuario;
		this.academia = academia;
		this.dataCriacao = dataCriacao;
		this.dataAlteracao = dataAlteracao;
	}

	public boolean isProfessor() {
		return this.getTipoUsuario().getId().equals(1);
	}

	public boolean isAluno() {
		return this.getTipoUsuario().getId().equals(2);
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Academia getAcademia() {
		return academia;
	}

	public void setAcademia(Academia academia) {
		this.academia = academia;
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
