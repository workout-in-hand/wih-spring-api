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
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String nome;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "tipoUsuario")
    private List<Usuario> usuarioList;

    public TipoUsuario(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Tipo Usuario: id = "+id+"; nome = "+nome;
    }
}
