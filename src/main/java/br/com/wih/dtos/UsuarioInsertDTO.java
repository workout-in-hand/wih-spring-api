package br.com.wih.dtos;

import java.util.Date;

public class UsuarioInsertDTO extends UsuarioDTO {

	private String senha;

	public UsuarioInsertDTO() {
		super();
	}

	public UsuarioInsertDTO(String id, String nome, String email, Boolean ativo, Integer idTipoUsuario,
			String academia, Date dataCriacao, Date dataAlteracao, String senha) {
		super(id, nome, email, ativo, idTipoUsuario, academia, dataCriacao, dataAlteracao);
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
