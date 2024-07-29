package afisare_numere_pare;

/**
 * sa se afiseze toate numere pare de la 0 la 100
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Varianta a doua");
        for (int i=0; i <=100; i+=2) {
            System.out.println(i);
        }

    }
}
