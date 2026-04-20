/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.sistemacontrolemusicas.gerentes;

/**
 *
 * @author Marcos Roberto
 */

import com.exemplo.sistemacontrolemusicas.classes.Album;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GerenteAlbuns {
    private final List<Album> albuns;
    
    public GerenteAlbuns(){
        this.albuns = new ArrayList<>();
    }

    public GerenteAlbuns(GerenteAlbuns outro){
        this.albuns = new ArrayList<>();
        
        if (outro != null) {
            for(Album a: outro.getAlbuns()){
                this.albuns.add(new Album(a));
            }
        }
    }
    
    public void copiar(GerenteAlbuns outro){
        this.albuns.clear();
        
        if (outro != null) {
            for(Album a: outro.getAlbuns()){
                Album album = new Album();
                album.copiar(a);
                this.albuns.add(album);
            }
        }
    }
    
    public void addAlbum(Album album){
        this.albuns.add(album);
    }

    public boolean removerAlbum(int index){
        if(index >= 0 && index < this.size()){
            this.albuns.remove(index);
            return true;
        }
        return false;
    }

    public boolean removerAlbum(String nome){
        for(int i = 0; i < this.albuns.size(); i++){
            if(nome.equals(this.albuns.get(i).getNome())){
                this.albuns.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Album getMaiorAlbum(){
        if (this.size() == 0) return null;

        Album maior = this.albuns.get(0);
        
        for(int i = 1; i < this.size(); i++){
            Album atual = this.albuns.get(i);
            if(atual.getGerente().size() > maior.getGerente().size()){
                maior = atual;
            }
        }
        return maior;
    }
    
    public String toStringResumido(){
        StringBuilder sb = new StringBuilder();
        sb.append("Albuns \n");
        
        for(Album album : this.albuns){
            sb.append(album.toStringResumido());
        }
        
        return sb.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Albuns[").append(this.size()).append("]:\n");
        
        for(Album album: this.albuns){
            sb.append(album.toString());
        }
        
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.albuns);
        return hash;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        GerenteAlbuns other = (GerenteAlbuns) obj;
        return Objects.equals(this.albuns, other.albuns);
    }
    
    public int size(){
        return this.albuns.size();
    }
    
    public Album getAlbum(int album){
        return albuns.get(album);
    }

    public Album getAlbum(String nome){
        for(Album album : this.albuns){
            if(nome.equals(album.getNome())){
                return album;
            }
        }
        return null;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }
}