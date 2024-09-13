import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gra {
    private ArrayList<Integer> wylosowane;
    private LinkedList<Integer> wpisane;
    private ArrayList<Integer> trafione;


    private void wylosujLiczby(int ile) {
        wylosowane = new ArrayList<>();
        int liczba;
        for (int i = 0; i < ile; i++) {
            liczba = (int) (Math.random() * 100 + 1);
            while (wylosowane.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);
            }
            wylosowane.add(liczba);
        }

    }
    private void wczytajLiczby(int ile){
        wpisane = new LinkedList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Podaj "+ile+" liczb");
        for (int i = 0; i < ile; i++) {
            wpisane.add(klawiatura.nextInt());
        }
    }

    private void wypiszListe(List<Integer> lista){
        for (Integer element:lista) {
            System.out.print(element+", ");
        }
    }

    private void sprawdzKtorePowtarzajaSie(){
        trafione = new ArrayList<>();
        for (Integer element:wylosowane){
            if(wpisane.contains(element)){
                trafione.add(element);
            }
        }
    }
    public void zagraj(){
        wylosujLiczby(26);
        wczytajLiczby(5);
        sprawdzKtorePowtarzajaSie();
        System.out.println("Liczby wylosowane");
        wypiszListe(wylosowane);
        System.out.println("Liczby wpisane");
        wypiszListe(wpisane);
        System.out.println("Liczby trafione");
        wypiszListe(trafione);
    }
}
