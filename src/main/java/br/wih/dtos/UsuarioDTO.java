package br.wih.dtos;

import br.wih.entities.Academia;
import br.wih.entities.TipoUsuario;
import lombok.*;

import java.util.Date;

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
