package zadaniaDomowe.zajecia2.zad5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
//Stwórz klasę Student która posiada pola:
//nr indeksu
//imie
//nazwisko
//płeć (wartość enum)
//W mainie stwórz instancję kolekcji typu ArrayList, która zawiera
//obiekty klasy Student.
//Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz
//cokolwiek).
//a. Spróbuj wypisać elementy listy stosując zwykłego
//"sout'a"
//b. Spróbuj wypisać elementy stosując pętlę foreach
//c. Wypisz tylko kobiety
//d. Wypisz tylko mężczyzn
//e. Wypisz tylko indeksy osób
    public static void main(String[] args) {
        Student s1 = new Student(11114L,"Jan","Kowalski",Plec.MEZCZYZNA);
        Student s2 = new Student(11112L,"Adam","Nowak",Plec.MEZCZYZNA);
        Student s3 = new Student(11113L,"Ola","Bis",Plec.KOBIETA);
        Student s4 = new Student(11111L,"Kasia","Marek",Plec.KOBIETA);
        List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4));


        Student s5 = new Student(11115L,"Kasia","Ziomek",Plec.KOBIETA);
        Student s6 = new Student(11116L,"Wojtek","Hugo",Plec.MEZCZYZNA);
        Student s7 = new Student(11117L,"Zosia","Pisz",Plec.KOBIETA);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        System.out.println(list);

        for (Student s:list) {
            System.out.println(s);
        }

        for (Student student : list) {
            if(student.getPlec()==Plec.KOBIETA){
                System.out.println(student);
            }
        }
        System.out.println("-----------------------------");
        for (Student student : list) {
            if(student.getPlec()==Plec.MEZCZYZNA){
                System.out.println(student);
            }
        }
        System.out.println("-------------------------------");
        for (Student student : list) {
            System.out.println(student.getNrIndeksu());
        }
        System.out.println("--------------------------------");
        for (Student student : list) {
            System.out.println(student.getNazwisko());
        }
    }
}