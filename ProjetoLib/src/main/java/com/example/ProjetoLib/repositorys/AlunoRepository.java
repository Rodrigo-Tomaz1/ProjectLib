package com.example.ProjetoLib.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoLib.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    List<Aluno> findAll();
}
