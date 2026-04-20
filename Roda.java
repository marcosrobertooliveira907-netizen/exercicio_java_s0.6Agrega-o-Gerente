/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Objects;

/**
 *
 * @author Marcos Roberto
 */
public class Roda {
    private double raio;
    private String material;
    private String cor;

    public Roda(){
        this.raio=0.0;
        this.material="";
        this.cor="";
    }
    public Roda(double raio,String material,String cor){
        this.raio = raio;
        this.material= material;
        this.cor = cor;
                
    }
    
    @Override
    
    public String toString(){
        return "Roda:"+"raio:"+this.raio+"material:"+this.material+
                "cor:"+this.cor;     
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    public void copiar(Roda outro){
        this.raio=outro.getRaio();
        this.material= outro.getMaterial();
        this.cor= outro.getCor();
    }
    
    @Override
    
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.raio) ^ (Double.doubleToLongBits(this.raio) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.material);
        hash = 41 * hash + Objects.hashCode(this.cor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Roda other = (Roda) obj;
        if (Double.doubleToLongBits(this.raio) != Double.doubleToLongBits(other.raio)) {
            return false;
        }
        if (!Objects.equals(this.material, other.material)) {
            return false;
        }
        return Objects.equals(this.cor, other.cor);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    

}
