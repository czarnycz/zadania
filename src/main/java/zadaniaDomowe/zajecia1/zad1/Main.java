package zadaniaDomowe.zajecia1.zad1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55)) ;
        Set<Integer> numbers = new HashSet<>(list);
        //a)liczba elementow unikalnych(roznych) metoda size().
        System.out.println("Ilosc unikalnych elementow = " + numbers.size());
        System.out.println("Set = " + numbers);
        //b)wszystkie elementy zbioru(iteracja po petli)

        System.out.println();
        System.out.println("-----------------");
        //usuwanie elementow 10 i 12. Ponowne wykonanie pkt a i b
        numbers.removeAll(Arrays.asList(10,12));
        System.out.println("Ilosc unikalnych elementow = " + numbers.size());
        for (int element : numbers) {
            System.out.print(element + ", ");
        }
        System.out.println();

        Set<Integer> numbers1 = new TreeSet<>(numbers);  // sortowanie elementow rosnaco w treeSet. Mozna zrobic ewentualnie iteracje w petli foreach

        System.out.println(numbers1);
        System.out.println(numbers1.size());


    }
}
