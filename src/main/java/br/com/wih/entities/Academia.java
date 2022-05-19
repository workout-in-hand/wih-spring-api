package br.com.wih.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "academia", schema = "public")
@Getter
@Setter
@NoArgsConstructor
public class Academia {

    @Id
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
