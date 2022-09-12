package com.aluno.controle.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluno.controle.entities.Usuario;
import com.aluno.controle.repositories.UsuarioRepository;



@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<Usuario> usuarios(){
		return usuarioRepository.findAll();
	}

}
