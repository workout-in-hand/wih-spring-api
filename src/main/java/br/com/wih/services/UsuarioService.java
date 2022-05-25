package br.com.wih.services;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.wih.dtos.UsuarioDTO;
import br.com.wih.dtos.UsuarioInsertDTO;
import br.com.wih.entities.Academia;
import br.com.wih.entities.TipoUsuario;
import br.com.wih.entities.Usuario;
import br.com.wih.repositories.AcademiaRepository;
import br.com.wih.repositories.TipoUsuarioRepository;
import br.com.wih.repositories.UsuarioRepository;
import br.com.wih.services.exceptions.EntityNotFoundException;

public class UsuarioService {

	@Autowired
	UsuarioRepository repository;
	
	@Autowired
	AcademiaRepository academiaRepository;
	
	@Autowired
	TipoUsuarioRepository tipoUsuarioRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public UsuarioDTO create(UsuarioInsertDTO dto) {
		
		String idAcademia = dto.getIdAcademia();
		Academia acad = academiaRepository.findById(idAcademia).orElseThrow( () ->{
			throw new EntityNotFoundException("Nao foi encontrada academia com id '"+idAcademia+"'");
		});
		
		Integer idTipoUsuario = dto.getIdTipoUsuario();
		TipoUsuario tipo = tipoUsuarioRepository.findById(idTipoUsuario).orElseThrow( () ->{
			throw new EntityNotFoundException("Nao foi encontrado Tipo Usuario com id '"+idTipoUsuario+"'");
		});
		
		Usuario entity = new Usuario();
		
		String senhaEncoded = passwordEncoder.encode(dto.getSenha());
		
		entity.setId(UUID.randomUUID().toString());
		entity.setNome(dto.getNome());
		entity.setEmail(dto.getEmail());
		entity.setSenha(senhaEncoded);
		entity.setAcademia(acad);
		entity.setTipoUsuario(tipo);
		entity.setAtivo(true);
		entity.setDataCriacao(new Date());
		entity.setDataAlteracao(new Date());
		
		entity = repository.save(entity);
		
		return new UsuarioDTO(entity);
	}
	
}
