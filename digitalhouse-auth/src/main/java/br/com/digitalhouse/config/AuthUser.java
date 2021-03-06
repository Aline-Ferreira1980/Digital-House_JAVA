package br.com.digitalhouse.config;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import br.com.digitalhouse.domain.Usuario;
import lombok.Getter;

@Getter
public class AuthUser extends User {

private static final long serialVersionUID = 1L;
	
	private Long userId;
	private String nomeCompleto;
	
	public AuthUser(Usuario usuario, Collection<? extends GrantedAuthority> permissoes) {
		super(usuario.getEmail(), usuario.getSenha(), permissoes);
		
		this.userId = usuario.getId();
		this.nomeCompleto = usuario.getNome();
	}
	
}
