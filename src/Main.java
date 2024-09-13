import javax.print.attribute.IntegerSyntax;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Gra gra1 = new Gra();
        gra1.zagraj();
        System.out.println("pierwsze" + sitoEra(200));
    }

    //do kartkowki
    static ArrayList<Integer> sitoEra(int liczba) {
        //przygotowanie listy z warosciami logicznymi
        ArrayList<Boolean> logiczne = new ArrayList<>();
        logiczne.add(false);
        logiczne.add(false);
        for (int i = 2; i < liczba; i++) {
            logiczne.add(true);
        }
        //wykreslanie wieloktornosci liczb pierwszych
        for (int i = 0; i < liczba; i++) {
            if (logiczne.get(i).equals(true)) {
                //wykreslanie zmiana na false
                for (int k = i * 2; k < liczba; k = k + i) {
                    logiczne.set(k, false);

                }
            }
        }
        ArrayList<Integer> pierwsze = new ArrayList<>();
        for (int i = 0; i < logiczne.size(); i++) {
            if (logiczne.get(i).equals(true)) {
                pierwsze.add(i);
            }

        }
        return pierwsze;
    }
}
