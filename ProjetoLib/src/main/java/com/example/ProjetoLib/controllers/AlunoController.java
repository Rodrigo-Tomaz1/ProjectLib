package com.example.ProjetoLib.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjetoLib.models.Aluno;
import com.example.ProjetoLib.repositorys.AlunoRepository;

@RestController
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/listarAlunos")
    public List<Aluno> listarAlunos(){
        return alunoRepository.findAll();
    }

    @PostMapping("/cadastrarAluno")
    public Aluno cadastrarAluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }
}
