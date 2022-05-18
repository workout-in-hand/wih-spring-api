package br.wih.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "academia", schema = "public")
@Getter
@Setter
@NoArgsConstructor
public class Academia {

    @Id
    @Setter(AccessLevel.PRIVATE)
    private String id;

    @NotEmpty(message = "Nome não pode ser vazio")
    private String nome;

    private Boolean ativo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario responsavel;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "academia")
    private List<Usuario> usuariosList;

    private Date dataCriacao;

    private Date dataAlteracao;

    public Academia(String nome, Boolean ativo, Usuario responsavel,Date dataCriacao, Date dataAlteracao) {
        this.nome = nome;
        this.ativo = ativo;
        this.responsavel = responsavel;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
    }
}
