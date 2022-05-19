package br.wih.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoUsuarioDTO {

    private int id;

    private String nome;

    @Override
    public String toString() {
        return "Tipo Usuario: id = "+id+"; nome = "+nome;
    }

}
