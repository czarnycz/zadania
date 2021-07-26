package zadaniaDomowe.zajecia2.zad2;

import java.util.Scanner;

public class Main {
    //Stwórz nowy program, zrealizuj polecenia:
    //- stwórz enum Płeć (KOBIETA, MEZCZYZNA)
    //- stwórz klasę Obywatel (imie, nazwisko, plec)
    //- stwórz w main scanner i każ użytkownikowi wpisać kolejno:
    //- swoje imie
    //- swoje nazwisko
    //- swoją płeć
    //- wykorzystaj zebrane informacje do stworzenia obiektu
    //obywatel
    //- po stworzeniu wypisz obiekt na ekran (nie chcemy żeby
    //wypisał się hashcode, co w tym celu należy
    //zaimplementować?)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Prosze podac: imie, nazwisko:");
        String name = input.next();
        String surname = input.next();
        System.out.println("Podaj plec:");
        Plec wybranaPlec = null;
        do {
            try {
                System.out.println("Dostepne opcje:");
                for (Plec plec : Plec.values()) {
                    System.out.println(" - " + plec);
                }
                String plec = input.next();
                wybranaPlec = Plec.valueOf(plec.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.err.println("Podano nieprawidlowa plec");
            }
        }while(wybranaPlec == null);


        Obywatel o1 = new Obywatel(name,surname,wybranaPlec);

        System.out.println(o1);

    }
}