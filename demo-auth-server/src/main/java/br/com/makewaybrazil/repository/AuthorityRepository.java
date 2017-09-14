package br.com.makewaybrazil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.makewaybrazil.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}