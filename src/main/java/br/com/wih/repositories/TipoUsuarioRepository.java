package br.com.wih.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wih.entities.TipoUsuario;

public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Integer> {

}
