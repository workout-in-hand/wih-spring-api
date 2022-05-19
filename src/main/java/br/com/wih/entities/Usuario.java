package br.com.wih.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    public Usuario(String nome, String email, String senha, Boolean ativo, TipoUsuario tipoUsuario, Academia academia, Date dataCriacao, Date dataAlteracao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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
