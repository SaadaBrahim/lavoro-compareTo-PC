import java.util.Date;

public class Main {
    

    
    public static void main(String args[]){
        Lista lista = new Lista();
        Computer pc1 = new Computer("msi", "intel i5", 8);
        Computer pc2 = new Computer("hp", "intel i7", 16);
        Computer pc3 = new Computer("mac", "M2", 32);
        Computer pc4 = new Computer("dady", "intel i3", 4);
        Computer pc5 = new Computer("zaka", "intel i3", 4);
        Computer pc6 = new Computer("rota", "intel i3", 4);
        Computer pc7 = new Computer("fede", "intel i3", 4);
        Computer pc8 = new Computer("pate", "intel i3", 4);


        
        // inserimento in coda
        lista.inserimentoInCoda("A", pc1 );
        lista.inserimentoInCoda("B", pc2);
        lista.inserimentoInCoda("C", pc3);

        System.out.print("inserimento in coda: ");
        Lista.stampaLista(lista);
        
        // inserimento in testa
        lista.inserimentoInTesta("Z", pc4);
        System.out.print("inserimento in testa: ");
        Lista.stampaLista(lista);
        
        // inserimento in mezzo
        lista.inserimentoInMezzo(2, "X", pc5);
        System.out.print("inserimento in mezzo: ");
        Lista.stampaLista(lista);

                lista.aggiungiInOrdineAlfabetico("M",pc6);
        System.out.print("aggiunta in ordine alfabetico M: ");
        Lista.stampaLista(lista);
        
        lista.aggiungiInOrdineAlfabetico("D", pc7);
        System.out.print("aggiunta in ordine alfabetico D: ");
        Lista.stampaLista(lista);
        
        lista.aggiungiInOrdineAlfabetico("Y", pc8);
        System.out.print("aggiunta in ordine alfabetico Y: ");
        Lista.stampaLista(lista);
        
    }
}