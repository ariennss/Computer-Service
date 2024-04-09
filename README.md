Progetto scolastico per imparare le basi della programmazione a oggetti e in particolare del linguaggio  Java. <br> <br>
<strong>Cosa ho imparato:</strong> <br>
- gestione delle Classi:
    - attributi
    - costruttore
    - metodi
    - getter e setter
- gestione delle Sottoclassi e ereditarietà
- gestione di Array, Arraylist e HashMap
- override e overload dei metodi
- utilizzo di equals e compareTo
- concetto "static" <br><br>
<br><br>
<strong>Struttura del progetto:</strong> <br><br>
<i>Classe Persona</i>;
- vari getter e setter
- toString
- equals <br><br>
<i>Classe CasaProduttrice</i>:
- vari getter e setter
- toString
- equals<br><br>
<i>Classe Computer</i>:
- ogni computer ha associato una Persona (utente) e una CasaProduttrice (marca), un valore ecc...
- vari getter e setter
- metodi per aumentare / diminuire prezzo di un Computer
- metodi per cambiare utente e per inserirne uno nuovo
- metodo per contare quanti computer sono stati creati
- toString
- compareTo<br><br>
<i>Sottoclasse ComputerPrivato</i>:
- eredita attributi della classe computer, ma risulta impossibile modificare l'utente<br><br>
<i>Sottoclasse ComputerTavolo</i>:
- eredita attributi dalla classe computer + attributo Monitor
- metodi per modificare il valore del monitor e per modificare il valore totale del computer di conseguenza<br><br>
<i>Classe ComputerService</i>
 - Gestisce un array di Computer
 - vari getter e setter
 - metodo per aggiungere un Computer nell'array
 - visualizzare il proprietario di un computer a partire dall'indice al quale si trova il Computer
 - modificare il proprietario di un computer a partire dall'indice al quale si trova il Computer
 - cercare Computer appartenente/i a una certa Persona
 - cercare il/i Computer di una certa CasaProduttrice
 - stampare tutti i Computer nell'Array
 - trovare il valore di un Computer a partire dall'indice
 - trovare il valore totale di tutti i Computer
 - trovare il computer più caro e il meno caro <br><br>
 <i>Classe ComputerServiceList</i>
 - stesse funzionalità della classe ComputerService, ma utilizza un Arraylist al posto di un Array <br><br>
<i>Classe YellowPages</i>
- Gestisce un HashMap <Città, ComputerService>
- vari getter e setter
- metodi per aggiungere / rimuovere un ComputerService nella mappa
- metodo per elencare le città presenti nella mappa
- metodo per trovare nome e indirizzo del ComputerService a partire dalla città a cui è collegato
