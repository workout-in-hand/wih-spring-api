package br.com.wih.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
