package br.wih.dtos;

import br.wih.entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AcademiaDTO {

    private String id;

    private String nome;

    private Boolean ativo;

    private Usuario responsavel;

    private List<Usuario> usuariosList;

    private Date dataCriacao;

    private Date dataAlteracao;

}
