public class Computer implements Comparable<Computer> {

    //attributi
    private static int contaId = 0;
    private int idComputer;
    private Persona user;
    private Casa marca;
    private int valore;
    private int quantiUser;
    private static int computerCostruiti = 0; //attributo di classe, all'inizio è 0

    //costruttore che non assegna user;
    public Computer(Casa marca, int valore) {
        this.idComputer = ++contaId;
        this.marca = marca;
        this.valore = valore;
        this.quantiUser = 0; //perché questo costruttore non assegna user
        computerCostruiti++; //così quando si costruisce un nuovo computer il conteggio aumenta di 1

    }

    //creato un secondo costruttore che passa l'User per far funzionare la classe ComputerPrivato
    public Computer(Persona user, Casa marca, int valore) {
        this.user = user;
        this.marca = marca;
        this.valore = valore;
        this.idComputer = ++contaId;
        computerCostruiti++;
        this.quantiUser++;
    }


    public Computer() {
        this.user = null;
        this.marca = null;
        this.valore = 0;
        this.idComputer = ++contaId;
        computerCostruiti++;
        this.quantiUser = 0;
    }

    //getter
    public int getIdComputer() {
        return this.idComputer;
    }

    public Persona getUser(){
        return this.user;
    }
    public Casa getMarca() {
        return this.marca;
    }

    public int getValore() {
        return this.valore;
    }
    public int getQuantiUser() {
        return this.quantiUser;
    }

    public static int getComputerCostruiti(){
        return computerCostruiti;
    }


    public static void setComputerCostruiti(int computerCostruiti) {
        Computer.computerCostruiti = computerCostruiti;
    }

    public void setMarca(Casa marca) {
        this.marca = marca;
    }

    public void setUser(Persona user) {

        this.user = user;
        quantiUser++; //così il n. di user aumenta se ne settiamo uno
        //un altro modo sarebbe stato usare il metodo private aumentaUser()
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    // aumentare valore
    public void aumenta(int x) {
        this.valore = this.valore + x;
    }

    // diminuire valore
    public void riduci (int x) {
        if (x < this.valore) {           //così valore non va sotto 0
            this.valore = this.valore - x;
        }
    }

    //per cambiare l'utilizzatore
    public void cambia(Persona nuovoUser) {
        this.user = nuovoUser;
        aumentaUser();
    }

    // conteggio dei computer che sono stati creati
    public static int contaQuantiComputer() {
        return computerCostruiti;
    }

    //metodo privato per aumentare di 1 il numero di utilizzatori
    private void aumentaUser() {
        this.quantiUser++;


    }

    @Override
    public String toString() {
        return "Computer {: " +
                "idComputer=" + idComputer +
                ", user =" + user +
                ", marca =" + marca +
                ", valore =" + valore +
                '}';
    }

    @Override
    public int compareTo(Computer o) {

            if (this.getValore() > o.getValore()) {
                return 1;
            } else if (this.getValore() < o.getValore()) {
                return -1;
            } else return 0;

    }
}
