public class ComputerTavolo extends Computer {

    private String tipoMonitor;
    private int valoreMonitor;

    public ComputerTavolo(Casa marca, int valore, String tipoMonitor, int valoreMonitor) {
        super(marca, valore);
        this.tipoMonitor = tipoMonitor;
        this.valoreMonitor = valoreMonitor;
    }

    public String getTipoMonitor() {
        return tipoMonitor;
    }

    public int getValoreMonitor() {
        return valoreMonitor;
    }



    /*
    In questo metodo setto un nuovo valore per il monitor. All'interno del metodo, devo modificare
    anche il valore complessivo, quindi richiamo il metodo setValore della classe computer e gli
    assegno come parametro il nuovo valore complessivo, aggiornato con il nuovo valore del monitor:
    ho assunto che il "valoreMonitor" facesse parte di "valore", perciò il valore aggiornato si calcola
    aggiungendo al valore precedente la differenza tra il nuovo valore del monitor e il valore del monitor
    di partenza.
     */

    public void cambiaValoreMonitor (int nuovoValore) {

        super.setValore(super.getValore() + (nuovoValore - this.valoreMonitor));
        this.valoreMonitor = nuovoValore;
    }

    @Override
    public String toString() {
        return "ComputerTavolo{" +
                "user=" + super.getUser() +
                "marca = " + super.getMarca() +
                "valore = " + super.getValore() +
                "tipoMonitor='" + tipoMonitor + '\'' +
                ", valoreMonitor=" + valoreMonitor +
                '}';
    }
}
