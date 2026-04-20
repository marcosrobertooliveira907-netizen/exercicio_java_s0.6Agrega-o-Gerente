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
public class GCarros {

    private List<Carro> ListCarro;

    public GCarros() {
        this.ListCarro = new ArrayList<>();
    }

    public GCarros(List<Carro> ListCarro) {
        this.ListCarro = new ArrayList<>();

        for (Carro c : ListCarro) {
            Carro novo = new Carro();
            novo.copiar(c);
            this.ListCarro.add(novo);
        }
    }

    public void addCarro(Carro c) {
        Carro novo = new Carro();
        novo.copiar(c);
        this.ListCarro.add(novo);
        System.out.println("Carro adicionado");
    }

    public boolean remove(String modelo, String fabricante) {
        for (int i = 0; i < ListCarro.size(); i++) {
            if (ListCarro.get(i).getModelo().equals(modelo) &&
                ListCarro.get(i).getFabricante().equals(fabricante)) {

                ListCarro.remove(i);
                return true;
            }
        }
        return false;
    }

    public Carro pesquisar(String modelo, String fabricante) {
        for (Carro c : this.ListCarro) {
            if (c.getModelo().equals(modelo) &&
                c.getFabricante().equals(fabricante)) {

                return c;
            }
        }
        return null;
    }

    public void listar() {
        for (Carro c : this.ListCarro) {
            System.out.println(c);
        }
    }

    public List<Carro> getListCarro() {
        return ListCarro;
    }

    public void setListCarro(List<Carro> ListCarro) {
        this.ListCarro = ListCarro;
    }
}