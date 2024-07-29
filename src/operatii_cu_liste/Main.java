package operatii_cu_liste;

import java.util.Scanner;

/**
 * 1. Sa se defineasca un array de 10 elemente, sa se afiseze acel array in consola.
 * 2. Sa se afiseze array-ul invers, de la coada spre inceput.
 * 3. Sa se afiseze toate numerele pare din array.
 * 4. Sa se calculeze suma numerelor divizibile cu 3 din array-ul dat.
 * 5. Sa se verifice daca numarul 9 este prezent in array. Daca este prezent, sa se afiseze un mesaj.
 * 6. Se citeste de la tastatura un numar intreg "n", sa se verifice daca acest numar este prezent in array.
 * 7. Se citeste de la tastatura un numar intreg "n", care va fi dimensiunea unui array. Elementele array-ului se vor citi de la tastatura.
 * Sa se afiseze elementele array-ului intr-o singura linie separate prin virgula.
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {8, 7, 2, 33, 4, 20, 6, 7, 17, 9};
        //                0 1 2  3 4  5 6 7  8 9
        afisareArray(numbers);

        System.out.println("-----------------------------------------");

        afisareArrayInvers(numbers);

        System.out.println("-----------------------------------------");

        afisareNumerePare(numbers);

        System.out.println("-----------------------------------------");

        afisareSumaNumereDivizibileCu3(numbers);

        System.out.println("-----------------------------------------");

        cautareNumarInArray(numbers);

        System.out.println("-----------------------------------------");

        //       citireNumarSiCautareInArray(numbers);

        System.out.println("-----------------------------------------");

        citireArrayDeLaTastatura();


    }

    public static void afisareArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            // Pentru a afisa elementele invers, folosim linia de mai jos
            // int element = numbers[numbers.length-1-i];
            if (i < (numbers.length - 1)) {
                System.out.print(element + ", ");
            } else {
                System.out.println(element);
            }
        }
    }

    public static void afisareArrayInvers(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            int element = numbers[i];
            if (i > 0) {
                System.out.print(element + ", ");
            } else {
                System.out.println(element);
            }
        }
    }

    public static void afisareNumerePare(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            if (element % 2 == 0) {
                System.out.println(element + "  ");
            }
        }
    }

    public static void afisareSumaNumereDivizibileCu3(int[] numbers) {
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            if (element % 3 == 0) {
                System.out.println(element);
                suma = suma + element;
            }
        }
        System.out.println(suma);
    }

    public static void cautareNumarInArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 9) {
                System.out.println(" S-a gasit numarul 9");
            }
        }
    }

    public static void citireNumarSiCautareInArray(int[] numbers) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numarul: ");
        int n = scanner.nextInt();
        //  boolean isPresent = false;
        int contor = 0;


        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            if (element == n) {
                //      isPresent = true;

                //      System.out.println(n + " - Numarul este prezent in array");
                contor++;
            }
        }
//        if (isPresent == false) {
//            System.out.println(n + " - Numarul nu este prezent in array.");
//        }
        if (contor > 0) {
            System.out.println(n + " - Numarul este prezent in array");
        } else {
            System.out.println(n + " - Numarul nu este prezent in array.");
        }
        scanner.close();
    }

    public static void citireArrayDeLaTastatura() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti dimensiunea array-ului: ");
        int n = scanner.nextInt();
        System.out.println("Introduceti elementele array-ului");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            // pentru a adauga un element pe pozitia i in array
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        afisareArray(numbers);

    }

}
