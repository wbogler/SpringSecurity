package com.aluno.controle.configuration;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aluno.controle.entities.Usuario;
import com.aluno.controle.repositories.UsuarioRepository;

@Service
public class UseDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	UsuarioRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> user= userRepository.findByusername(username);
		if(user.isPresent()) {
			return user.get();
		}
		return null;
	}
	
	

}
