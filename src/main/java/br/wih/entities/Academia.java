package br.wih.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "academia", schema = "public")
@Getter
@Setter
@NoArgsConstructor
public class Academia {

    @Id
    @Setter(AccessLevel.PRIVATE)
    private String id;

    private String nome;

    private Boolean ativo;

    private Usuario responsavel;

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
