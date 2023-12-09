package br.com.lginfo.cursospring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lginfo.cursospring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User teste = new User(1L, "Leo", "leo@teste.com","55555555", "Stringpassword10");
		return ResponseEntity.ok().body(teste);
		
	}

}
