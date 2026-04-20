/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exemplo.sistemacarros;
import classes.Carro;
import classes.Proprietario;
import classes.Roda;
/**
 *
 * @author Marcos Roberto
 */
public class SistemaCarros {

    public static void main(String[] args) {

        Carro c1 = new Carro("BMW", "X1", "preta");
        Proprietario p1 = new Proprietario("Marcos", "marcos@gmail.com", "111111");

        Roda r1 = new Roda(20.0, "Liga esportiva", "prata");
        c1.getRodas().addRoda(r1);

        Carro c2 = new Carro("Audi", "A3", "vermelho");
        c2.getRodas().addRoda(new Roda(19.0, "Liga esportiva", "preta"));

        p1.getCarro().addCarro(c1);
        p1.getCarro().addCarro(c2);

        Carro c3 = new Carro("Jeep", "Compass", "branco");
        Carro c4 = new Carro("Nissan", "Kicks", "preto");

        Roda r2 = new Roda(18.0, "Liga reforçada", "grafite");
        c3.getRodas().addRoda(r2);
        c4.getRodas().addRoda(new Roda(17.0, "Liga comum", "cinza"));

        Proprietario p2 = new Proprietario("Taylla", "taylla@gmail.com", "222222");
        p2.getCarro().addCarro(c3);
        p2.getCarro().addCarro(c4);

        System.out.println("    PROPRIETARIO 1     ");
        System.out.println("Nome: " + p1.getNome());
        p1.getCarro().listar();

        System.out.println("\n     PROPRIETARIO 2   ");
        System.out.println("Nome: " + p2.getNome());
        p2.getCarro().listar();

        boolean iguais = false;

        for (Carro carro1 : p1.getCarro().getListCarro()) {
            for (Carro carro2 : p2.getCarro().getListCarro()) {
                if (carro1.getFabricante().equals(carro2.getFabricante())) {
                    iguais = true;
                }
            }
        }

        if (iguais) {
            System.out.println("Possuem fabricantes iguais");
        } else {
            System.out.println("Nao possuem fabricantes iguais");
        }
    }
}