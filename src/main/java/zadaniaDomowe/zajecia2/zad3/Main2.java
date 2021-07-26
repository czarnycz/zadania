package zadaniaDomowe.zajecia2.zad3;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main2 {
    //Stwórz drugiego main’a i wykonaj te same instrukcje, ale zamień
    //implementację z HashMap na TreeMap.
    public static void main(String[] args) {
        Student s1 = new Student(100200L, "Jan", "Kowalski");
        Student s2 = new Student(111143L, "Adam", "Nowak");
        Student s3 = new Student(111132L, "Marek", "Kowalski");
        Student s4 = new Student(111121L, "Ola", "Nowak");
        Student s5 = new Student(100400L, "Wojtek", "Kowalski");

        Map<Long, Student> studentMap1 = new TreeMap<>(Comparator.reverseOrder());
        studentMap1.put(s1.getIndexNumber(), s1);
        studentMap1.put(s2.getIndexNumber(), s2);
        studentMap1.put(s3.getIndexNumber(), s3);
        studentMap1.put(s4.getIndexNumber(), s4);
        studentMap1.put(s5.getIndexNumber(), s5);


        sprawdzCzyIndeksJestZawartyWMapie(studentMap1, 100200L);

        System.out.println(studentMap1.get(100400L));
        String listaStudentow = String.valueOf(studentMap1); //*
        System.out.println(listaStudentow);
        System.out.println(studentMap1.keySet());


        for (Student student : studentMap1.values()) {
            System.out.println(student);
        }


    }

    private static boolean sprawdzCzyIndeksJestZawartyWMapie(Map<Long, Student> studentMap, Long szukanaWartosc) {
        boolean student = studentMap.containsKey(szukanaWartosc);
        if (student) {
            System.out.println("Mapa zawiera studenta o podanym indeksie " + szukanaWartosc);
        } else {
            System.out.println("Mapa nie zawiera studenta o podanym indeksie " + szukanaWartosc);
        }
        return student;
    }
}