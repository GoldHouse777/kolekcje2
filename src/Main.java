import javax.print.attribute.IntegerSyntax;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //TABLICA
        /*
        - tablica musi miec zdefiniowant rozmiar, ktorego potem nie mozemy zmienic.
        - tablica przechowuje typy proste i zlozone.
         */

        int [] tablicaLiczbLosowych = new int[6];
        //losujemy wartosci z zakresu od 1 do 100
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = (int)(Math.random()*100+1);
        }
        //wypisywanie tablicy na ekranie
        for (int element:tablicaLiczbLosowych) {
            System.out.println(element+", ");
        }
        //wypelnianie kolekcji wartosciami losowymi
        /*
        - kolekcja moze przechowywac tylko typy zlozone np. Integer
        - kolekcja nie musi miec zdefiniowanego rozmiaru, rozmiar moze sie zmieniac w trakcie
        - List -> ArrayList, LinkedList,
        - Set -> HashSet
         */

        List<Integer> listaLiczbLosowych = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int)(Math.random()*100);
            listaLiczbLosowych.add(liczba);
        }
        System.out.println("Wylosowana liczba");
        for (Integer element:listaLiczbLosowych) {
            System.out.println(element+", ");
        }
        System.out.println(listaLiczbLosowych);
        //losowanie do lisy bez powtorzen
        ArrayList<Integer> listaLosowychBezPowtorzen = new ArrayList<>();
        int liczba;
        for (int i = 0; i < 6; i++) {
            liczba = (int)(Math.random()*100+1);
            while(listaLosowychBezPowtorzen.contains(liczba)){
                liczba = (int)(Math.random()*100+1);
            }
            listaLosowychBezPowtorzen.add(liczba);
        }
        System.out.println(listaLosowychBezPowtorzen);
        /*
        - lista:
        indeksowana, uporzadkowana, elementy moga sie powtarzac

        - zbiór: (zazwyczaj)
        nieindeksowana, nieuporzadkowane, elementy unikatowe (bez powtorzen)
         */

        HashSet<Integer> zbiorLiczbLosowych = new HashSet<>();
        while(zbiorLiczbLosowych.size()<6){
            liczba = (int)(Math.random()*100+1);
            zbiorLiczbLosowych.add(liczba);
        }
        System.out.println("Zbiór liczb losowych");
        System.out.println(zbiorLiczbLosowych);

        //lista liczb wczytywanych z klawiatury
        Scanner klawiatura = new Scanner(System.in);
        LinkedList<Integer> listaLiczbZKlawiatury = new LinkedList<>();
        System.out.println("Podaj 6 liczb");
        for (int i = 0; i < 6; i++) {
            int wartosc = klawiatura.nextInt();
            listaLiczbZKlawiatury.add(wartosc);
        }
        //trafione czyli takie ktore sa i we wpisanych i w wylosowanych


    }
}