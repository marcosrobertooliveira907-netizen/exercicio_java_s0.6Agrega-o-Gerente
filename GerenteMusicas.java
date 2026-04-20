/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.sistemacontrolemusicas.gerentes;

/**
 *
 * @author Marcos Roberto
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import com.exemplo.sistemacontrolemusicas.classes.Musica;

public class GerenteMusicas {
    private final List<Musica> musicas;
    
    public GerenteMusicas(){
        this.musicas = new ArrayList<>();
    }

    public GerenteMusicas(GerenteMusicas outro){
        this.musicas = new ArrayList<>();
        
        if (outro != null) {
            for(Musica m: outro.getMusicas()){
                this.musicas.add(new Musica(m));
            }
        }
    }
    
    public void copiar(GerenteMusicas outro){
        this.musicas.clear();
        
        if (outro != null) {
            for(Musica m: outro.getMusicas()){
                Musica musica = new Musica();
                musica.copiar(m);
                this.musicas.add(musica);
            }
        }
    }
    
    public int size(){
        return this.musicas.size();
    }

    public void addMusica(Musica musica){
        this.musicas.add(musica);
    }

    public boolean removerMusica(int i){
        if(i >= 0 && i < this.size()){
            this.musicas.remove(i);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Musicas[").append(this.size()).append("]:\n");
        
        for(Musica musica: this.musicas){
            sb.append(musica.toString());
        }
        
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.musicas);
        return hash;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        GerenteMusicas other = (GerenteMusicas) obj;
        return Objects.equals(this.musicas, other.musicas);
    }
    
    public Musica getMusica(int musica){
        return this.musicas.get(musica);
    }
    
    public List<Musica> getMusicas() {
        return musicas;
    }
}