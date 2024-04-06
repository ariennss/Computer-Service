/* ho aggiunto un secondo costruttore nella classe Computer che passa anche l'Utente oltre a marca e valore:
inoltre ho fatto anche override del metodo "setUser" perché sennò era possibile settare un user in un primo
momento e poi un secondo user subito dopo, praticamente cambiando così l'utente, che è proprio ciò che non voglio
che accada. In questo modo non posso più utilizzare né il metodo "cambia" né il metodo "setUser" e l'unico
utente possibile viene inizializzato nel costruttore.
 */


public class ComputerPrivato extends Computer {

    public ComputerPrivato (Persona user, Casa marca, int valore) {
        super(user, marca, valore);


    }

    @Override
    public void cambia(Persona nuovoUser) {
        System.out.println("Errore: non è possibile cambiare l'utente.");
    }

    @Override
    public void setUser(Persona user) {
        System.out.println("Errore: l'utente è già stato assegnato.");
    }

    @Override
    public Persona getUser() {
        return super.getUser();
    }

    @Override
    public String toString() {
        return "ComputerPrivato{" + "user=" + super.getUser() +
                "user = " + super.getUser() +
                "marca = " + super.getMarca() +
                "valore = " + super.getValore() + "}";
    }
}
