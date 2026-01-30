import java.util.Date;

public class Main {
    

    
    public static void main(String args[]){
        Lista lista = new Lista();
        
        // inserimento in coda
        lista.inserimentoInCoda("A");
        lista.inserimentoInCoda("B");
        lista.inserimentoInCoda("C");
        System.out.print("inserimento in coda: ");
        Lista.stampaLista(lista);
        
        // inserimento in testa
        lista.inserimentoInTesta("Z");
        System.out.print("inserimento in testa: ");
        Lista.stampaLista(lista);
        
        // inserimento in mezzo
        lista.inserimentoInMezzo(2, "X");
        System.out.print("inserimento in mezzo: ");
        Lista.stampaLista(lista);
        
        // aggiungi in ordine alfabetico
        lista.aggiungiInOrdineAlfabetico("M");
        System.out.print("aggiunta in ordine alfabetico M: ");
        Lista.stampaLista(lista);
        
        lista.aggiungiInOrdineAlfabetico("D");
        System.out.print("aggiunta in ordine alfabetico D: ");
        Lista.stampaLista(lista);
        
        lista.aggiungiInOrdineAlfabetico("Y");
        System.out.print("aggiunta in ordine alfabetico Y: ");
        Lista.stampaLista(lista);
    }
}