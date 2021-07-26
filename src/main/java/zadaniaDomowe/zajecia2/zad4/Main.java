package zadaniaDomowe.zajecia2.zad4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    //Stwórz main, w nim dodaj instrukcje:
    //- Stwórz klasę ParaLiczb która powinna posiadać pola typu
    //int o nazwie liczbaA, liczbaB, =>
    //ParaLiczb (int liczbaA,int liczbaB)
    //- Stwórz Set obiektów typu ParaLiczb
    //- Utwórz kilka instancji obiektu ParaLiczb z wartościami:
    //- (1,2)
    //- (2,1)
    //- (1,1)
    //- (1,2)
    //- Wyświetl wszystkie elementy zbioru na ekran. Czy program
    //działa zgodnie z oczekiwaniem?
    //- Jak wpłynąć na program żeby usunął duplikat (tj. dwa razy
    //występuje ParaLiczb z wartościami (1,2)
    public static void main(String[] args) {
        ParaLiczb n1 = new ParaLiczb(1, 2);
        ParaLiczb n2 = new ParaLiczb(2, 1);
        ParaLiczb n3 = new ParaLiczb(1, 1);
        ParaLiczb n4 = new ParaLiczb(1, 2);

        Set<ParaLiczb> numbers = new HashSet<>();

        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        numbers.add(n4);


        for (ParaLiczb p : numbers) {
            System.out.println(p);
        }
    }
}