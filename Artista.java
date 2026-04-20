/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.sistemacontrolemusicas.classes;

/**
 *
 * @author Marcos Roberto
 */

import com.exemplo.sistemacontrolemusicas.gerentes.GerenteAlbuns;
import java.util.Objects;

import java.util.Objects;

public class Artista {
    private String nome;
    private GerenteAlbuns gerente;
    
    public Artista(){
        this.nome = "";
        this.gerente = new GerenteAlbuns();
    }

    public Artista(String nome) {
        this.nome = nome;
        this.gerente = new GerenteAlbuns();
    }

    public Artista(Artista outro){
        if (outro != null) {
            this.nome = outro.nome;
            this.gerente = new GerenteAlbuns(outro.gerente);
        } else {
            this.gerente = new GerenteAlbuns();
        }
    }

    public void copiar(Artista outro){
        if (outro != null) {
            this.nome = outro.nome;
            this.gerente.copiar(outro.gerente);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.gerente);
        return hash;
    }

 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Artista other = (Artista) obj;
        return Objects.equals(this.nome, other.nome) &&
               Objects.equals(this.gerente, other.gerente);
    }
    
    public String toStringResumido(){
        return this.nome + ": " + this.gerente.size() + " Albuns\n";
    }
    
    @Override
    public String toString(){
        return "--- Artista ---\n" +
               "Nome: " + this.nome + "\n" +
               this.gerente.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GerenteAlbuns getGerente() {
        return gerente;
    }

    
}