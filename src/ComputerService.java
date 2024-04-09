import java.util.Arrays;

public class ComputerService {
    private Persona titolare;
    private String nome;
    private String indirizzo;
    private Computer[] arrayDiComputer; //l'array, per ora vuoto
    private int quantiComputer; //quanti computer ci sono nell'array

    public ComputerService(Persona titolare, String nome, String indirizzo, int maxComputer) {
        this.titolare = titolare;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.arrayDiComputer = new Computer[maxComputer];
        quantiComputer = 0; //per ora non ci sono computer nell'array

    }

    //getter e setter
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

    public int getQuantiComputer() {
        return quantiComputer;
    }

    //metodo per aggiungere un Computer nel Service
    public int aggiungiAlGruppo(Computer c) {
        if (quantiComputer < arrayDiComputer.length) {
            arrayDiComputer[quantiComputer] = c; /* al gruppoComputer che per ora ha 0 computer, assegno
                                                   il computer c */


            return quantiComputer++; //inizializzato a 0 inizialmente
        }
        return -1; //restituisce -1 se non è possibile inserire un ulteriore computer così che si capisca che c'è un errore


    }



    //visualizzare il proprietario di un computer dato il suo indice nel vettore.
    public void visualizzaProprietario(int indice) {

        if (indice < arrayDiComputer.length) {
            if (arrayDiComputer[indice] != null) {
                if (arrayDiComputer[indice].getUser() != null) { //perché ci sono anche i computer costruiti senza user
                    System.out.println("Il proprietario del computer all'indice " + indice + " è: " + arrayDiComputer[indice].getUser());
                } else {
                    System.out.println("Non è stato assegnato nessun user a questo computer"); //se non c'è l'user
                }
            } else {
                System.out.println("Non è ancora stato assegnato un computer a questo indice.");
            }
        } else System.out.println("Indice non valido.");
        /*Mi rendo conto che forse il primo "if" di questa catena non ha molto senso considerando che
        * se nel main inserisco come parametro un indice che non fa parte dell'array, Java risponde con
        * una exception IndexOutOfBounds, ma l'ho fatto per provare. Nei prossimi metodi simili a questo
        * (in cui bisogna passare un indice come parametro) non l'ho più fatto. */
    }


    public void cercaComputerDi(Persona p) {

        Computer[] temp = new Computer[arrayDiComputer.length];
        int conteggio = 0;
        int i;
        for (i = 0; i < arrayDiComputer.length; i++) {
            if (arrayDiComputer[i] != null && arrayDiComputer[i].getUser() != null) {
                if (arrayDiComputer[i].getUser().equals(p)) {
                    temp[conteggio] = arrayDiComputer[i];
                    conteggio++;
                    System.out.println(i + " " + " - Computer: " + arrayDiComputer[i].toString());
                }
            }
        }

    }

    //stampare i dati di ognuno dei computer.
    public void stampaDatiComputer() {
        int i;
        for (i = 0; i < arrayDiComputer.length; i++) {
            if (arrayDiComputer[i] != null) {
                System.out.println(arrayDiComputer[i].toString());
            }
        }
    }

    //modificare il proprietario di un computer dato il suo indice.
    public Persona modificaPropietario(int indice, Persona user) {
        /* Persona temp = this.service[indice].getUser();
        temp = user; */
        this.arrayDiComputer[indice].setUser(user);

        return this.arrayDiComputer[indice].getUser();
    }

    //trovare il valore di un computer dato il suo indice.
    public int trovaValoreComputer(int indice) {
        return arrayDiComputer[indice].getValore();
    }

   // trovare totale valori dei pc gestiti dal service

    public int trovaValoreTotale() {
        int somma = 0;
        int i;
        for (i = 0; i < arrayDiComputer.length; i++) {
            if (arrayDiComputer[i] != null) {
                int valore = arrayDiComputer[i].getValore();
                somma = somma + valore;
            }
        }
        return somma;
    }

    public Computer computerPiuCaro() {
        int piuCaro = 0;
        Computer prodottoPiuCaro = null;
        int i;
        for (i = 0; i < arrayDiComputer.length; i++) {
            if (arrayDiComputer[i] != null) {
                if (arrayDiComputer[i].getValore() > piuCaro) {
                    piuCaro = arrayDiComputer[i].getValore();
                    prodottoPiuCaro = arrayDiComputer[i];
                }
            }
        }
        return prodottoPiuCaro;
    }

    public Computer computerMenoCaro() {
        int menoCaro = Integer.MAX_VALUE;
        Computer prodottoMenoCaro = null;
        int i;
        for (i = 0; i < arrayDiComputer.length; i++) {
            if (arrayDiComputer[i] != null) {
                if(arrayDiComputer[i].getValore() < menoCaro) {
                    menoCaro = arrayDiComputer[i].getValore();
                    prodottoMenoCaro = arrayDiComputer[i];
                }
            }
        }
        return prodottoMenoCaro;
    }

    //trovare computer con una data marca: restituisce un array.
    public Computer[] trovaComputerConMarca(Casa c) {

        Computer[] temp = new Computer[arrayDiComputer.length];
        int conteggio = 0;
        int i;
        for (i = 0; i < arrayDiComputer.length; i++) {
            if (arrayDiComputer[i] != null) {
                if (this.arrayDiComputer[i].getMarca() != null && this.arrayDiComputer[i].getMarca().equals(c)) {
                    temp[conteggio] = this.arrayDiComputer[i];
                    conteggio++;
                }
            }
        }


        return temp;


    }


    public Computer[] computerConUnicoProprietario() {
        Computer[] temp = new Computer[arrayDiComputer.length];
        int i;
        int conteggio = 0;
        for (i = 0; i < arrayDiComputer.length; i++) {
            if (this.arrayDiComputer[i] != null) {
              if (this.arrayDiComputer[i].getQuantiUser() == 1) {
                  temp[conteggio] = this.arrayDiComputer[i];
                  conteggio++;

              }
            }
        }
        return temp;
    }

    public void stampaPerValore() {
        Computer[] ordinato = this.arrayDiComputer;
        Arrays.sort(ordinato);

        System.out.println("I valori in ordine crescente sono: ");
         for (int i = 0; i < quantiComputer; i++) {
             System.out.println(ordinato[i].getValore());
         }
        System.out.println("I Computer in ordine per valore crescente sono: ");
         for (int i = 0; i < quantiComputer; i++) {
             System.out.println(arrayDiComputer[i]);
         }
    }

    @Override
    public String toString() {
        return "ComputerService: " + Arrays.toString(arrayDiComputer);
    }
}