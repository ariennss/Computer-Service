
import java.util.Arrays;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Persona Arianna = new Persona("Franchetto", "Via Roma 10");
        Persona Alessandra = new Persona("Rossi");
        Persona Marco = new Persona("Bianchi", "Via Milano 20");
        Persona Gino = new Persona("Verdi", "Via Nizza 45");

        Casa Lenovo = new Casa("Lenovo", "Cina");
        Casa Samsung = new Casa("Samsung", "Corea");
        Casa Acer = new Casa("Acer");

        Computer computer1 = new Computer(Lenovo, 300);
        Computer computer2 = new Computer(Samsung, 450);
        Computer computer3 = new Computer(Lenovo, 1000);
        ComputerTavolo tavolo1 = new ComputerTavolo(Acer, 300, "LCD", 50);
        ComputerPrivato privato1 = new ComputerPrivato(Arianna, Lenovo, 300);
        Computer computer5 = new Computer(Marco, Lenovo, 300);
        int totaleComputer = Computer.contaQuantiComputer();
        System.out.println("In totale sono stati costruiti " + totaleComputer + " Computer.");
        System.out.println("Il cognome dell'user Arianna è " + Arianna.getCognome());
        Alessandra.setIndirizzo("Via Torino 15");
        System.out.println("L'indirizzo di Alessandra è " + Alessandra.getIndirizzo());

        ComputerService gruppoComputer1 = new ComputerService(Arianna, "pippo", "Torino, via Roma 1", 10);




        System.out.println("Il nome della casa produttrice Lenovo è " + Lenovo.getNome());
        Acer.setNazione("Taiwan");
        System.out.println("La casa produttrice Acer si trova in " + Acer.getNazione());




        System.out.println("Numero Identificativo Unico del computer1: " + computer1.getIdComputer());
        System.out.println("La marca del computer1 è: " + computer1.getMarca()); //funziona ora che ho messo il metodo toString.


        computer1.riduci(20);
        System.out.println("Il nuovo valore del computer1 è: " + computer1.getValore());



        System.out.println("Fino ad ora abbiamo costruito " + Computer.getComputerCostruiti() + " computer.");


        computer1.setUser(Arianna);
        System.out.println("L'user assegnato al computer1 è " + computer1.getUser());
        computer1.cambia(Alessandra);
        System.out.println("L'user del computer1 è diventato " + computer1.getUser());
        computer1.cambia(Marco);
        System.out.println("L'user del computer1 è diventato " + computer1.getUser());

        int a = computer1.getQuantiUser();
        System.out.println("In totale il computer1 ha " + a + " user.");

        System.out.println("Il numero identificativo unico del computer2 è: " + computer2.getIdComputer());
        computer2.setUser(Alessandra);



        System.out.println("L'utente assegnato al computer privato è: " + privato1.getUser());
        privato1.setUser(Alessandra);
        privato1.cambia(Marco);


        System.out.println("Il valore del computer da tavolo è: " + tavolo1.getValore());
        tavolo1.setValore(350);
        System.out.println("Il valore del computer da tavolo viene cambiato a: " + tavolo1.getValore());
        System.out.println("Il valore iniziale del monitor è: " + tavolo1.getValoreMonitor());
        tavolo1.cambiaValoreMonitor(100);
        System.out.println("Il valore del monitor è stato modificato a: " + tavolo1.getValoreMonitor());
        System.out.println("Il nuovo valore totale del computer dopo il cambio del valore del monitor è: " + tavolo1.getValore());
        System.out.println("Il computer privato1 ha " + privato1.getQuantiUser() + " user.");



        //Creato un gruppoComputer1 con array inizialmente vuoto
        System.out.println("Nel gruppoComputer1 ci sono " + gruppoComputer1.getQuantiComputer() + " computer.");

        //Aggiungere un computer nell'array
        int indice = gruppoComputer1.aggiungiAlGruppo(computer1);
        System.out.println("computer1 aggiunto all'indice: " + indice);
        System.out.println("Ora nel service ci sono: " + gruppoComputer1.getQuantiComputer() + " computer.");
        int indice2 = gruppoComputer1.aggiungiAlGruppo(computer2);
        System.out.println("Computer2 aggiunto all'indice: " + indice2);
        System.out.println("Ora nel service ci sono: " + gruppoComputer1.getQuantiComputer() + " computer.");
        gruppoComputer1.aggiungiAlGruppo(computer3);
        gruppoComputer1.aggiungiAlGruppo(tavolo1);
        tavolo1.setUser(Arianna);
        gruppoComputer1.aggiungiAlGruppo(privato1);
        System.out.println("computer5 aggiunto all'indice: " + gruppoComputer1.aggiungiAlGruppo(computer5));

        //stampare i dati di ciascun computer all'interno del computer service.
        gruppoComputer1.stampaDatiComputer();

        //visualizzare il proprietario di un computer dato il suo indice
        gruppoComputer1.visualizzaProprietario(1);
        gruppoComputer1.visualizzaProprietario(2);

        //trovare i computer di una certa persona p
        System.out.println("I computer di Arianna si trovano in posizione: ");
        gruppoComputer1.cercaComputerDi(Arianna);


        //modificare il proprietario di un computer a partire dall'indice
        System.out.println(computer2.getUser()); //controllo chi è l'user del computer2
        Persona pippo = gruppoComputer1.modificaPropietario(1, Gino);
        System.out.println("Il nuovo proprietario del computer2 è: " + pippo);

        //trovare il valore di un computer
        System.out.println("Il prezzo del computer all'indice 1 è: ");
        System.out.println(gruppoComputer1.trovaValoreComputer(1));

        //trovare il computer più caro
        System.out.println("Il computer più caro è: ");
        System.out.println(gruppoComputer1.computerPiuCaro());

        //trovare il computer meno caro
        System.out.println("Il computer meno caro è: ");
        System.out.println(gruppoComputer1.computerMenoCaro());

        //trovare il valore del totale dei computer gestiti dal service.
        System.out.println("Il valore totale dei computer è: " + gruppoComputer1.trovaValoreTotale());
        gruppoComputer1.stampaDatiComputer();

        //trovare i computer di una certa marca
        Computer[] computers = gruppoComputer1.trovaComputerConMarca(Lenovo);
        System.out.println("I computer con marca Lenovo sono: ");
        for (Computer computer : computers) {
            if (computer != null) {
                System.out.println(computer);
            }
        }

        //oppure:
        System.out.println("Stessa cosa, ma usando Arrays.toString: ");
        System.out.println(Arrays.toString(gruppoComputer1.trovaComputerConMarca(Samsung)));

        //trovare i computer con unico proprietario
        System.out.println("Mostriamo solo i computer con un unico proprietario: ");
        System.out.println(Arrays.toString(gruppoComputer1.computerConUnicoProprietario()));

        /* Creo un secondo computer service con un array completamente pieno per usare sort */
        ComputerService gruppoComputer2 = new ComputerService(Marco, "paperino", "Milano, via Vittorio 20", 4);
        gruppoComputer2.aggiungiAlGruppo(computer1);
        gruppoComputer2.aggiungiAlGruppo(computer2);
        gruppoComputer2.aggiungiAlGruppo(computer3);
        gruppoComputer2.aggiungiAlGruppo(tavolo1);
        System.out.println("nel gruppoComputer2 ci sono: " + gruppoComputer2.getQuantiComputer() + " computer.");

        //metodo che stampa i computer in base al valore crescente: usa il metodo sort e l'interfaccia compareTo
        System.out.println("I computer vengono stampati in ordine di prezzo crescente:");
        gruppoComputer2.stampaPerValore();


        //questo per mostrare che se l'array è pieno viene restituito un -1 come indicatore di un errore.
        int indicenullo = gruppoComputer2.aggiungiAlGruppo(computer1);
        System.out.println("Computer1 aggiunto all'indice: " + indicenullo);
        gruppoComputer2.visualizzaProprietario(45);

        //implementazione di una seconda classe uguale a ComputerService MA usa arraylist invece che array
        ComputerServiceList gruppoComputer3 = new ComputerServiceList(Arianna, "topolino", "Roma, via Bho 15");
        int i = gruppoComputer3.aggiungiComputer(computer1);
        System.out.println("Computer1 aggiunto all'indice " + i);
        gruppoComputer3.aggiungiComputer(computer2);
        gruppoComputer3.aggiungiComputer(computer3);
        gruppoComputer3.aggiungiComputer(computer5);
        gruppoComputer3.aggiungiComputer(privato1);
        gruppoComputer3.aggiungiComputer(tavolo1);
        gruppoComputer3.stampaDatiComputer();
        gruppoComputer3.rimuoviComputer(tavolo1);
        gruppoComputer3.aggiungiComputer(tavolo1);
        gruppoComputer3.stampaDatiComputer();
        Persona x = gruppoComputer3.getProprietario(1);
        System.out.println("Il proprietario del computer all'indice 1 è: " + x);
        gruppoComputer3.modificaProprietario(1, Alessandra);
        Persona y = gruppoComputer3.getProprietario(1);
        System.out.println("Il nuovo proprietario del computer1 è: " + y);
        int valore = gruppoComputer3.trovaValoreComputer(1);
        System.out.println("Il valore del computer all'indice 1 é: " + valore);
        System.out.println("Il valore totale dei computer nell'arrayList è: " + gruppoComputer3.trovaValoreTotale());
        System.out.println("Il computer più caro nell'ArrayList è: " + gruppoComputer3.trovaComputerPiuCaro());
        System.out.println("Il computer meno caro nell'ArrayList è: " + gruppoComputer3.trovaComputerMenoCaro());
        System.out.println(gruppoComputer3.trovaComputerConUnicoProprietario());
        System.out.println("Computer stampati per valore: ");
        gruppoComputer3.stampaPerValore();
        System.out.println("Ora cerco i computer dell'user Arianna: ");
        gruppoComputer3.cercaComputerDi(Arianna);
        System.out.println("Ora cerco i computer con marca Acer");
        System.out.println(gruppoComputer3.cercaComputerConMarca(Acer));

        //Creazione hashmap
        YellowPages yellowPages = new YellowPages();
        System.out.println(yellowPages); //vuota
        yellowPages.aggiungiElemento("Torino", gruppoComputer1);
        yellowPages.aggiungiElemento("Milano", gruppoComputer2);
        System.out.println(yellowPages);
        yellowPages.rimuoviElemento("Milano");
        System.out.println(yellowPages);
        yellowPages.rimuoviElemento("Taiwan");
        yellowPages.trovaNomeEIndirizzo("Torino");
        yellowPages.trovaNomeEIndirizzo("Bologna");
        yellowPages.aggiungiElemento("Milano", gruppoComputer2);
        yellowPages.elencoCitta();


    }
}
