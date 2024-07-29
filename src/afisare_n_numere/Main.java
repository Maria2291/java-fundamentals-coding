package afisare_n_numere;

/**
 * Sa se folosasca cele 3 structuri repetitive pentrau a afisa toate numerele de la 0-10
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("Afisare numere cu for");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Afisare numere cu While");
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;

        }

        System.out.println("Afisare numere cu DO-While");
        i = 0; // resetare i pentru a incepe numaratoare de la 0
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);


    }
}