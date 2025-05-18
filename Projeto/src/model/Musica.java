/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Elizabeth
 */
public class Musica {
    private String nome, artista, genero;
    private int anolancamento, id;
    
    public Musica() {
}

    public Musica(String nome, String artista, String genero, int anolancamento, int id) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.anolancamento = anolancamento;
        this.id = id;
    }

    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(int anolancamento) {
        this.anolancamento = anolancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Musica{" +
                ", nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", genero='" + genero + '\'' +
                ", anolancamento='" + anolancamento + '\'' +
                "id=" + id + '\'' +
                '}';
    }
    
}
