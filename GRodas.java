/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcos Roberto
 */

public class GRodas {

    private List<Roda> ListRoda;

    public GRodas() {
        this.ListRoda = new ArrayList<>();
    }

    public GRodas(List<Roda> ListRoda) {
        this.ListRoda = new ArrayList<>();
        for (Roda r : ListRoda) {
            Roda nova = new Roda();
            nova.copiar(r);
            this.ListRoda.add(nova);
        }
    }

    public void addRoda(Roda r) {
        this.ListRoda.add(r);
        System.out.println("Adicionado com sucesso");
    }

    public boolean remove(String cor, double raio) {
        for (int i = 0; i < ListRoda.size(); i++) {
            if (ListRoda.get(i).getCor().equals(cor) &&
                ListRoda.get(i).getRaio() == raio) {

                ListRoda.remove(i);
                return true;
            }
        }
        return false;
    }

    public Roda pesquisar(String cor, String material) {
        for (Roda r : this.ListRoda) {
            if (r.getMaterial().equals(material) &&
                r.getCor().equals(cor)) {
                return r;
            }
        }
        return null;
    }

    public void listar() {
        for (Roda r : ListRoda) {
            System.out.println(r);
        }
    }

    public List<Roda> getListRoda() {
        return ListRoda;
    }
}





