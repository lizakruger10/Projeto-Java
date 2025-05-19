package model;

public class Musica {
    private String nome, artista, genero;
    private int anolancamento, id;
    private boolean curtiu;
    private boolean descurtiu;

    public Musica() {
        this.curtiu = false;
        this.descurtiu = false;
    }

    public Musica(String nome, String artista, String genero,
                  int anolancamento, int id, boolean curtiu, boolean descurtiu) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.anolancamento = anolancamento;
        this.id = id;
        this.curtiu = curtiu;
        this.descurtiu = descurtiu;
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

    public boolean isCurtiu() {
        return curtiu;
    }

    public void setCurtiu(boolean curtiu) {
        this.curtiu = curtiu;
    }

    public boolean isDescurtiu() {
        return descurtiu;
    }

    public void setDescurtiu(boolean descurtiu) {
        this.descurtiu = descurtiu;
    }

    @Override
    public String toString() {
        String statusInfo = "";
        if (curtiu) {
            statusInfo = " 👍";
        } else if (descurtiu) {
            statusInfo = " 👎";
        }
        // Esta será a String exibida na JList
        return String.format("ID: %d | %s - %s [%s] (%d)%s",
                id, nome, artista, genero, anolancamento, statusInfo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musica musica = (Musica) o;
        return id == musica.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
