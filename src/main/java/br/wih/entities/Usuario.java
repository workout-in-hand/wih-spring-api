package br.wih.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "usuario", schema = "public")
@Getter
@Setter
@NoArgsConstructor
public class Usuario {

    @Id
    @Setter(AccessLevel.PRIVATE)
    private String id;

    @NotEmpty(message = "Nome não pode ser vazio")
    private String nome;
    @NotEmpty(message = "Login não pode ser vazio")
    private String login;
    @NotEmpty(message = "Senha não pode ser vazia")
    private String senha;

    private String email;

    private Boolean ativo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_usuario")
    private TipoUsuario tipoUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_academia")
    private Academia academia;

    private Date dataCriacao;

    private Date dataAlteracao;

    public Usuario(String nome, String login, String senha, String email, Boolean ativo, TipoUsuario tipoUsuario, Academia academia, Date dataCriacao, Date dataAlteracao) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.ativo = ativo;
        this.tipoUsuario = tipoUsuario;
        this.academia = academia;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
