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

public class Proprietario {

    private String nome;
    private String email;
    private String cpf;
    private GCarros carro;

    public Proprietario() {
        this.nome = "";
        this.cpf = "";
        this.email = "";
        this.carro = new GCarros();
    }

    public Proprietario(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.carro = new GCarros();
    }

    public Proprietario(Proprietario outro) {
        this.nome = outro.getNome();
        this.cpf = outro.getCpf();
        this.email = outro.getEmail();
        this.carro = new GCarros(outro.getCarro().getListCarro());
    }

    public void imprimir() {
        System.out.println(this);
    }

    public void copiar(Proprietario outro) {
        this.nome = outro.getNome();
        this.email = outro.getEmail();
        this.cpf = outro.getCpf();

        this.carro = new GCarros();

        for (Carro c : outro.getCarro().getListCarro()) {
            Carro novo = new Carro();
            novo.copiar(c);
            this.carro.addCarro(novo);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.email);
        hash = 79 * hash + Objects.hashCode(this.cpf);
        hash = 79 * hash + Objects.hashCode(this.carro);
        return hash;
    }

 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Proprietario other = (Proprietario) obj;

        if (nome == null ? other.nome != null : !nome.equals(other.nome)) return false;
        if (email == null ? other.email != null : !email.equals(other.email)) return false;
        if (cpf == null ? other.cpf != null : !cpf.equals(other.cpf)) return false;
        if (carro == null ? other.carro != null : !carro.equals(other.carro)) return false;

        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public GCarros getCarro() {
        return carro;
    }

    public void setCarro(GCarros carro) {
        this.carro = carro;
    }
}