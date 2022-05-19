package br.com.wih.services;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.wih.repositories.UsuarioRepository;

public class UsuarioService {

	@Autowired
	UsuarioRepository repository;
	
}
