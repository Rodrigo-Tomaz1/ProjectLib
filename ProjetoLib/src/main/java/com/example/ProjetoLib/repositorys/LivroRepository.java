package com.example.ProjetoLib.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoLib.models.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
    
}
