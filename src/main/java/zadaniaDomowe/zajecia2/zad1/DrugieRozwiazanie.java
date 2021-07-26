package zadaniaDomowe.zajecia2.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrugieRozwiazanie {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("10030", "3004", "4000", "12355", "12222",
                "67888", "111200", "225355", "2222", "1111", "3546", "138751", "235912"));
        znajdzElementNaIndexie(stringList, "138751");
        sprawdzCzyIstniejeObiekt(stringList,"67888" );
        // sprawdzenie metodą contains
        // -- wypisanie wyniku sprawdzenia na ekran
        sprawdzCzyIstniejeObiekt(stringList,"67889");
        // usuniecie elementu
        stringList.remove("67888");
        stringList.remove("67889");

        //ponowne wykonanie poprzednich operacji
        // sprawdzenie metodą indexof
        // -- wypisanie wyniku sprawdzenia na ekran
        znajdzElementNaIndexie(stringList,"138751");
        // sprawdzenie metodą contains
        // -- wypisanie wyniku sprawdzenia na ekran
        sprawdzCzyIstniejeObiekt(stringList,"67888");
        // sprawdzenie metodą contains
        // -- wypisanie wyniku sprawdzenia na ekran
        sprawdzCzyIstniejeObiekt(stringList,"67889");
        // wypisanie pętlą forEach
        for (String element:stringList) {
            System.out.println(element + ", ");

        }
        // wypisanie pętlą forEach (w jednej linii)
        for (String element:stringList) {
            System.out.print(element + ", ");
        }
    }

    private static boolean sprawdzCzyIstniejeObiekt(List<String> stringList, String wartoscDoPorownania) {
        // sprawdzenie metodą contains
        // -- wypisanie wyniku sprawdzenia na ekran
        boolean obiekt = stringList.contains(wartoscDoPorownania);
        if(obiekt){
            System.out.println("Istnieje obiekt " + wartoscDoPorownania);
        }else {
            System.out.println("Nie istnieje obiekt " + wartoscDoPorownania );
        }return obiekt;
    }

    private static int znajdzElementNaIndexie(List<String> stringList, String wartoscSzukana ) {
        // sprawdzenie metodą indexof
        // -- wypisanie wyniku sprawdzenia na ekran
        int index = stringList.indexOf(wartoscSzukana);
        if (index != -1) {
            System.out.println("Indeks wartosci 138751 to: " + index);
        }else{
            System.out.println("Nie znaleziono wartosci " + wartoscSzukana);
        }
        return index;
    }
}