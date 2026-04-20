/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.sistemacontrolemusicas.classes;

/**
 *
 * @author Marcos Roberto
 */

import com.exemplo.sistemacontrolemusicas.gerentes.GerenteMusicas;
import java.util.Objects;

public class Album {
    private String nome;
    private int anoLancamento;
    private GerenteMusicas gerente;
    
    public Album(){
        this.nome = "";
        this.anoLancamento = 0;
        this.gerente = new GerenteMusicas();
    }

    public Album(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.gerente = new GerenteMusicas();
    }

    public Album(Album outro){
        if (outro != null) {
            this.nome = outro.nome;
            this.anoLancamento = outro.anoLancamento;
            this.gerente = new GerenteMusicas(outro.gerente);
        } else {
            this.gerente = new GerenteMusicas();
        }
    }

    public void copiar(Album outro){
        if (outro != null) {
            this.nome = outro.nome;
            this.anoLancamento = outro.anoLancamento;
            this.gerente.copiar(outro.gerente);
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + this.anoLancamento;
        hash = 89 * hash + Objects.hashCode(this.gerente);
        return hash;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Album other = (Album) obj;
        return this.anoLancamento == other.anoLancamento &&
               Objects.equals(this.nome, other.nome) &&
               Objects.equals(this.gerente, other.gerente);
    }
    
    public String toStringResumido(){
        return this.nome + ": " + this.gerente.size() + " Musicas\n";
    }
    
    @Override
    public String toString(){
        return "Album \n" +
               "Nome: " + this.nome + "\n" +
               "Ano de lancamento: " + this.anoLancamento + "\n" +
               this.gerente.toString();
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public GerenteMusicas getGerente() {
        return this.gerente;
    }
}