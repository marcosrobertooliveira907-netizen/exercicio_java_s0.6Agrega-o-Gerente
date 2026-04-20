/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exemplo.sistemacontrolemusicas;

/**
 *
 * @author Marcos Roberto
 */


import com.exemplo.sistemacontrolemusicas.classes.Artista;
import com.exemplo.sistemacontrolemusicas.classes.Album;
import com.exemplo.sistemacontrolemusicas.classes.Musica;
import com.exemplo.sistemacontrolemusicas.gerentes.GerenteArtista;
import com.exemplo.sistemacontrolemusicas.gerentes.GerenteAlbuns;

public class SistemaControleMusicas{

    public static void main(String[] args) {

        GerenteArtista gerArtistas = new GerenteArtista();

        Artista a1 = new Artista("Marcos");
        Artista a2 = new Artista("Taylla");

        Album al1 = new Album("Album Rock", 2020);
        Album al2 = new Album("Album Pop", 2021);
        Album al3 = new Album("Album Jazz", 2022);

        Musica m1 = new Musica("Musica 1", 3.5);
        Musica m2 = new Musica("Musica 2", 4.0);
        Musica m3 = new Musica("Musica 3", 2.8);

        al1.getGerente().addMusica(m1);
        al1.getGerente().addMusica(m2);

        al2.getGerente().addMusica(m3);

        al3.getGerente().addMusica(m1);
        al3.getGerente().addMusica(m2);
        al3.getGerente().addMusica(m3);

        a1.getGerente().addAlbum(al1);
        a1.getGerente().addAlbum(al2);

        a2.getGerente().addAlbum(al3);

        gerArtistas.addArtista(a1);
        gerArtistas.addArtista(a2);

        System.out.println("=== ARTISTAS ===");
        System.out.println(gerArtistas);

        System.out.println("=== ARTISTA COM MAIS ÁLBUNS ===");
        System.out.println(gerArtistas.getMaiorArtista().getNome());

        System.out.println("=== ÁLBUM COM MAIS MÚSICAS ===");

        GerenteAlbuns todosAlbuns = new GerenteAlbuns();
        todosAlbuns.addAlbum(al1);
        todosAlbuns.addAlbum(al2);
        todosAlbuns.addAlbum(al3);

        System.out.println(todosAlbuns.getMaiorAlbum().getNome());
    }
}