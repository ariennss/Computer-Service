// classe Persona
/*
introdurre una variabile static per contare gli ID
private static int conta = 0;
e poi this.id = conta++;
essendo static assume un solo valore per tutta la classe
 */

import java.util.Objects;

public class Persona {

    //attributi
    private int id;
    private static int conteggio = 0; //aggiunto questo per rendere l'ID unico
    private String cognome;
    private String indirizzo;


    public Persona (String cognome, String indirizzo) {
        this.id = ++conteggio;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
    }

    public Persona(String cognome) {
        this.id = ++conteggio;
        this.cognome = cognome;
        this.indirizzo = " ";
    }

    //get id
    public int getId() {
        return id;
    }

    //get cognome
    public String getCognome() {
        return cognome;
    }

    //get indirizzo
    public String getIndirizzo() {
        return indirizzo;
    }

    //set indirizzo
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String toString() {
        return " " + id + " " + cognome + " " + indirizzo;
    }



    public boolean equals(Persona user) {
        if (this == user) {
            return true;
        }
        else if (user == null || this.id != user.id || this.cognome != user.cognome || this.indirizzo != user.indirizzo || getClass() != user.getClass()) {return false;};
        Persona proprietario = (Persona) user;
        return Objects.equals(id, proprietario.id) && Objects.equals(cognome, proprietario.cognome) && Objects.equals(indirizzo, proprietario.indirizzo);
    }


}



