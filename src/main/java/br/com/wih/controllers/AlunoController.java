package br.com.wih.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wih.dtos.UsuarioDTO;
import br.com.wih.dtos.UsuarioInsertDTO;
import br.com.wih.services.AlunoService;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

	@Autowired
	AlunoService alunoService;

	@PostMapping
	public ResponseEntity<UsuarioDTO> create(@RequestBody UsuarioInsertDTO dto) {
		UsuarioDTO novoUsuario = alunoService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
	}
}
