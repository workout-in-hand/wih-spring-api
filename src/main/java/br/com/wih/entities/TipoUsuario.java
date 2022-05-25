package br.com.wih.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_usuario", schema = "public")
public class TipoUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoUsuario")
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);

	public TipoUsuario() {}
	
	public TipoUsuario(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Tipo Usuario: id = " + id + "; nome = " + nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


}
