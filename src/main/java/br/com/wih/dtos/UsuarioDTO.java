package br.com.wih.dtos;

import java.util.Date;

import br.com.wih.entities.Academia;
import br.com.wih.entities.TipoUsuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private String id;

    private String nome;

    private String email;

    private String senha;

    private Boolean ativo;

    private TipoUsuario tipoUsuario;

    private Academia academia;

    private Date dataCriacao;

    private Date dataAlteracao;

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
