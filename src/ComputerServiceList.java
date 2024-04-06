
import java.util.ArrayList;
import java.util.Collections;


public class ComputerServiceList {
    private Persona titolare;
    private String nome;
    private String indirizzo;
    private ArrayList <Computer> computerArrayList;

    public ComputerServiceList (Persona titolare, String nome, String indirizzo) {
        this.titolare = titolare;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.computerArrayList = new ArrayList<Computer>();
    }

    public Persona getTitolare() {
        return titolare;
    }

    public void setTitolare(Persona titolare) {
        this.titolare = titolare;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int aggiungiComputer(Computer c) {
        computerArrayList.add(c);
        return computerArrayList.indexOf(c);
    }

    public void rimuoviComputer(Computer c) {
        computerArrayList.remove(c);
    }

    public Persona getProprietario(int indice){
        Computer c = computerArrayList.get(indice);
        return c.getUser();
    }

    public void stampaDatiComputer() {
        for (Computer c : computerArrayList) {
            System.out.println(c.toString());
        }
    }

    public void modificaProprietario(int indice, Persona nuovo) {
        Computer c = computerArrayList.get(indice);
        c.setUser(nuovo);
    }

    public int trovaValoreComputer(int indice) {
        Computer c = computerArrayList.get(indice);
        return c.getValore();
    }

    public int trovaValoreTotale() {
        int somma = 0;
        for (Computer c : computerArrayList) {
            int valore = c.getValore();
            somma = somma + valore;
        }
        return somma;
    }

    public Computer trovaComputerPiuCaro() {
        Computer c = null;
        int piuCaro = 0;
        for (Computer computer : computerArrayList) {
            if (computer.getValore() > piuCaro) {
                c = computer;
                piuCaro = computer.getValore();
            }
        } return  c;
    }

    public Computer trovaComputerMenoCaro() {
        Computer c = null;
        int menoCaro = Integer.MAX_VALUE;
        for (Computer computer : computerArrayList) {
            if (computer.getValore() < menoCaro) {
                c = computer;
                menoCaro = computer.getValore();
            }
        } return c;
    }

    public ArrayList<Computer> trovaComputerConUnicoProprietario() {
        ArrayList<Computer> temp = new ArrayList<Computer>();
        for (Computer c : computerArrayList) {
            if (c.getQuantiUser() == 1) {
                temp.add(c);
            }
        } return temp;
    }

    public void stampaPerValore() {
        ArrayList<Computer> ordinato = this.computerArrayList;
        Collections.sort(ordinato);

        for (Computer p : ordinato) {
            System.out.println(p);
        }
    }

    public void cercaComputerDi(Persona x) {
        int i;
        for (i = 0; i < computerArrayList.size(); i++) {
            if (computerArrayList.get(i).getUser() != null) {
                if (computerArrayList.get(i).getUser().equals(x)) {
                    System.out.println(i + " " + " - Computer: " + computerArrayList.get(i).toString());
                }
            }
        }
    }

    public ArrayList<Computer> cercaComputerConMarca(Casa casa) {
        int i;
        ArrayList<Computer> temp = new ArrayList<>();

        for (i = 0; i < computerArrayList.size(); i++) {
            if (computerArrayList.get(i).getMarca().equals(casa)) {
                temp.add(computerArrayList.get(i));
            }
        }
        return temp;
    }
}
