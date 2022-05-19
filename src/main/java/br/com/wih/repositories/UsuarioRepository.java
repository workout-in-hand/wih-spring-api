package br.com.wih.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wih.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
