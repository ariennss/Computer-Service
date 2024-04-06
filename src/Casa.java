// classe Casa Produttrice di computer

import java.util.Objects;

public class Casa {

    //attributi
    private String nome;
    private String nazione;

    //costruttori
    public Casa (String nome) {
        this.nome = nome;
        this.nazione = " ";
    }

    public  Casa (String nome, String nazione) {
        this.nome = nome;
        this.nazione = nazione;
    }

    //getter
    public String getNome() {
        return this.nome;
    }

    public String getNazione() {
        return this.nazione;
    }

    //setter
    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public String toString() {
        return " " + nome + " " + nazione;
    } //così quando faccio println di Marca non escono cose strane
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casa casa = (Casa) o;
        return Objects.equals(nome, casa.nome) && Objects.equals(nazione, casa.nazione);
    }*/

    public boolean equals(Casa marca) {
        if (this == marca) {
            return true;
        }
        else if (marca == null || this.nome != marca.nome || this.nazione != marca.nazione || getClass() != marca.getClass()) {return false;};
        Casa casa = (Casa) marca;
        return Objects.equals(nome, casa.nome) && Objects.equals(nazione, casa.nazione);
    }

}


