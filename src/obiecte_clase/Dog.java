package obiecte_clase;

public class Dog {
    // Proprietati
    String rasa;
    int varsta;
    String name;

    // Constructori
    public Dog () {
        // constructor default
        // acest constructor se genereaza automat si nu este vizibil in cod
        // atunci cand generam un contructor, constructorul default DISPARE
        // daca avem un constructor definit, putem defini in mod explicit constructorul default
    }

    public Dog (String rasa, int varsta, String name) {
        // constructor cu parametrii

        this.rasa = rasa;
        this.varsta = varsta;
        this.name = name;

    }
    // metode
    public String toString() {
        // metoda toString () transforma obiectul nostru intr-un text
        // atunci cand dorim sa afisam un obiect folosind System.out.println, metoda toString se apeleaza automat
        return "Rasa: " + this.rasa + ", Varsta: " + this.varsta + ", Nume: " + this.name;
    }

    public boolean equals(Object o) {
        Dog obj = (Dog) o; // am facut cast de la object la Dog

        if (this.name.equals(obj.name) && this.rasa.equals(obj.rasa) && this.varsta == obj.varsta) {
            return true;
        } else {
            return false;
        }
    }
}
