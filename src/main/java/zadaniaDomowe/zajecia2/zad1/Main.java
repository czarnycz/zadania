package zadaniaDomowe.zajecia2.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //Stwórz maina, a w nim kolejną listę String'ów. Wykonaj zadania:
    //1. dodaj do listy elementy 10030, 3004, 4000,
    //2. 12355, 12222, 67888, 111200, 225355, 2222, 1111, 3546,
    //138751, 235912 (jako stringi) (dodaj je posługując się
    //metodą Arrays.asList())
    //Przykład użycia Arrays.asList():
    //ArrayList<Integer> liczby = new ArrayList<>(Arrays.asList(23,
    //32, 44, 55, 677, 11, 33));
    //Podany przykład to tylko demonstracja metody Arrays.asList,
    //zadanie należy wykonać na liście String’ów.
    //3. określ indeks elementu 138751 posługując się metodą
    //indexOf
    //4. sprawdź czy istnieje na liście obiekt 67888 metodą
    //contains (wynik wypisz na ekran)
    //5. sprawdź czy istnieje na liście obiekkt 67889 metodą
    //contains (wynik wypisz na ekran)
    //6. usuń z listy obiekt 67888 oraz 67889 (metoda remove)
    //7. wykonaj ponownie polecenia z punktu 3, 4, 5.
    //8. iteruj całą listę (pętla forEach), wypisz elementy na ekran
    //w oddzielnych liniach
    //9. iteruj całą listę (pętla forEach), wypisz elementy na ekran
    //w jednej linii
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("10030", "3004", "4000", "12355", "12222",
                "67888", "111200", "225355", "2222", "1111", "3546", "138751", "235912"));
        System.out.println("Indeks elementu 138751 to: " + stringList.indexOf("138751"));
        System.out.println("Istnieje element 67888: " + stringList.contains("67888"));
        System.out.println("Istnieje element 67889: " + stringList.contains("67889"));
        stringList.remove("67888");
        stringList.remove("67889");
        System.out.println(stringList);


        System.out.println("Indeks elementu 138751 to: " + stringList.indexOf("138751"));
        System.out.println("Istnieje element 67888: " + stringList.contains("67888"));
        System.out.println("Istnieje element 67889: " + stringList.contains("67889"));

        System.out.println(stringList);

        for (String a : stringList) {
            System.out.println(a + ", ");


        }
        for (String a : stringList) {
            System.out.print(a + ", ");


        }

    }
}