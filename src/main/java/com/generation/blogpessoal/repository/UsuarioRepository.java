package com.generation.blogpessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepositoryImplementation<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario(String usuario);
}
