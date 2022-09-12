package com.aluno.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aluno.controle.entities.Usuario;
import com.aluno.controle.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> todosUsuario(){
		return ResponseEntity.ok(usuarioService.usuarios());
	}

}
