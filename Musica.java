/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.sistemacontrolemusicas.classes;

/**
 *
 * @author Marcos Roberto
 */


import java.util.Objects;

public class Musica {
    private String titulo;
    private double duracao;
    
    public Musica(){
        this.titulo = "";
        this.duracao = 0.0;
    }

    public Musica(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public Musica(Musica outra){
        this.titulo = outra.titulo;
        this.duracao = outra.duracao;
    }
    
    public void copiar(Musica outra){
        if (outra != null) {
            this.titulo = outra.titulo;
            this.duracao = outra.duracao;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.titulo);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.duracao) ^ (Double.doubleToLongBits(this.duracao) >>> 32));
        return hash;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Musica other = (Musica) obj;
        return Double.compare(this.duracao, other.duracao) == 0 &&
               Objects.equals(this.titulo, other.titulo);
    }
    
    @Override
    public String toString(){
        return "Musica \n" +
               "Titulo: " + this.titulo + "\n" +
               "Duracao: " + this.duracao + "\n";
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return this.duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}