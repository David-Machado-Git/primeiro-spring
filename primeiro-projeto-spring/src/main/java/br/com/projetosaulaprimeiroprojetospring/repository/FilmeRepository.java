package br.com.projetosaulaprimeiroprojetospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetosaulaprimeiroprojetospring.entity.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
