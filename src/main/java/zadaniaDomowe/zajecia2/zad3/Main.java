package zadaniaDomowe.zajecia2.zad3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    //Utwórz klasę Student o polach (long) numerIndeksu, imie,
    //nazwisko oraz:
    //- utwórz kilku studentów i dodaj ich do mapy (kluczem jest
    //indeks,
    //- sprawdź czy mapa zawiera studenta o indeksie 100200,
    //- wypisz studenta o indeksie 100400
    //- wypisz listę studentów
    //- wypisz listę indeksów
    public static void main(String[] args) {
        Student s1 = new Student(100200L,"Jan","Kowalski");
        Student s2 = new Student(111143L,"Adam","Nowak");
        Student s3 = new Student(111132L,"Marek","Kowalski");
        Student s4 = new Student(111121L,"Ola","Nowak");
        Student s5 = new Student(100400L,"Wojtek","Kowalski");

        Map<Long, Student> studentMap = new HashMap<>();
        studentMap.put(s1.getIndexNumber(),s1);
        studentMap.put(s2.getIndexNumber(),s2);
        studentMap.put(s3.getIndexNumber(),s3);
        studentMap.put(s4.getIndexNumber(),s4);
        studentMap.put(s5.getIndexNumber(),s5);

        sprawdzCzyIndeksJestZawartyWMapie(studentMap,100200L);

        System.out.println(studentMap.get(100400L));

        System.out.println(studentMap.keySet());
        for(Student student:studentMap.values()){
            System.out.println(student);
        }






    }

    private static boolean sprawdzCzyIndeksJestZawartyWMapie(Map<Long, Student> studentMap, Long szukanaWartosc) {
        boolean student = studentMap.containsKey(szukanaWartosc);
        if(student){
            System.out.println("Mapa zawiera studenta o podanym indeksie " + szukanaWartosc);
        }else{
            System.out.println("Mapa nie zawiera studenta o podanym indeksie " + szukanaWartosc);
        }return student;
    }
}
