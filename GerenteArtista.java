/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.sistemacontrolemusicas.gerentes;

/**
 *
 * @author Marcos Roberto
 */

import com.exemplo.sistemacontrolemusicas.classes.Artista;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GerenteArtista {
    private final List<Artista> artistas;
    
    public GerenteArtista(){
        this.artistas = new ArrayList<>();
    }

    public GerenteArtista(GerenteArtista outro){
        this.artistas = new ArrayList<>();
        
        if (outro != null) {
            for(Artista a: outro.getArtistas()){
                this.artistas.add(new Artista(a));
            }
        }
    }

    public void copiar(GerenteArtista outro){
        this.artistas.clear();
        
        if (outro != null) {
            for(Artista a: outro.getArtistas()){
                Artista artista = new Artista();
                artista.copiar(a);
                this.artistas.add(artista);
            }
        }
    }

    public void addArtista(Artista artista){
        this.artistas.add(artista);
    }

    public boolean removerArtista(int index){
        if(index >= 0 && index < this.size()){
            this.artistas.remove(index);
            return true;
        }
        return false;
    }

    public boolean removerArtista(String nome){
        for(int i = 0; i < this.artistas.size(); i++){
            if(nome.equals(this.artistas.get(i).getNome())){
                this.artistas.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public int size(){
        return this.artistas.size();
    }

    public Artista getMaiorArtista(){
        if (this.size() == 0) return null;

        Artista maior = this.artistas.get(0);

        for(int i = 1; i < this.size(); i++){
            Artista atual = this.artistas.get(i);
            if(atual.getGerente().size() > maior.getGerente().size()){
                maior = atual;
            }
        }
        return maior;
    }
    
    public String toStringResumido(){
        StringBuilder sb = new StringBuilder();
        sb.append("--- Artistas ---\n");
        
        for(Artista artista : this.artistas){
            sb.append(artista.toStringResumido());
        }
        
        return sb.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Artistas[").append(this.size()).append("]:\n");
        
        for(Artista artista: this.artistas){
            sb.append(artista.toString());
        }
        
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.artistas);
        return hash;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        GerenteArtista other = (GerenteArtista) obj;
        return Objects.equals(this.artistas, other.artistas);
    }
    
    public Artista getArtista(int artista){
        return this.artistas.get(artista);
    }

    public Artista getArtista(String nome){
        for(Artista artista : this.artistas){
            if(nome.equals(artista.getNome())){
                return artista;
            }
        }
        return null;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

}

