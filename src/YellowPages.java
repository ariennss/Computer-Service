import java.util.HashMap;
import java.util.Set;

public class YellowPages {

    private HashMap<String, ComputerService> hashmap;

    //costruttore
    public YellowPages (){

        this.hashmap = new HashMap<String, ComputerService>();
    }
    //aggiungere una città e il suo ComputerService
    public void aggiungiElemento(String citta, ComputerService computerService) {
        if (hashmap.containsKey(citta)) {
            System.out.println("Il ComputerService della città di " + citta + " è già stato inserito.");
        }
        else hashmap.putIfAbsent(citta, computerService);
    }

    public void rimuoviElemento(String citta){
        if (hashmap.containsKey(citta)){
            hashmap.remove(citta);
        }
        else {
            System.out.println("Non è associato alcun ComputerService alla città " + citta + ".");
        }
    }

    public void trovaNomeEIndirizzo(String citta){
        if (hashmap.containsKey(citta)) {
            ComputerService x = hashmap.get(citta); //a partire dalla chiave, restituisce il valore associato a quella chiave (nel nostro caso la classe COmputerService di cui vogliamo nome e indirizzo)
            String nome = x.getNome();
            String indirizzo = x.getIndirizzo();

            System.out.println("Il ComputerService della città " + citta + "ha come nome: " + nome + " e come indirizzo: " + indirizzo + ".");
        }
        else {
            System.out.println("Non esiste un ComputerService associato alla città " + citta + ".");
        }

    }

    public Set<String> elencoCitta() {
        System.out.println(hashmap.keySet());
        return hashmap.keySet();
    }

    @Override
    public String toString() {
        return "Pagine gialle: " + hashmap;
    }
}
