package br.wih.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_usuario", schema = "public")
@Getter
@Setter
@NoArgsConstructor
public class TipoUsuario {

    @Id
    @Setter(AccessLevel.PRIVATE)
    private String id;

    private String nome;

    private String descricao;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "tipoUsuario")
    private List<Usuario> usuarioList;

    public TipoUsuario(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

}
