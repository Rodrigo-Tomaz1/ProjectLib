package com.example.ProjetoLib.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeLivro;
    private int qtdExemplares;
    private String nomeAutor;
    
    public int getId() {
        return id;
    }
    public String getNomeLivro() {
        return nomeLivro;
    }
    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
    public int getQtdExemplares() {
        return qtdExemplares;
    }
    public void setQtdExemplares(int qtdExemplares) {
        this.qtdExemplares = qtdExemplares;
    }
    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
}
