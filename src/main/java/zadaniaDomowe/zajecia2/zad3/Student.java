package zadaniaDomowe.zajecia2.zad3;

public class Student {
    private Long indexNumber;
    private String imie;
    private String nazwisko;
    //dodanie konstruktora, getterow, settterow, metody toString()
    @Override
    public String toString() {
        return "Student{" +
                "indexNumber=" + indexNumber +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    public Long getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(Long indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Student(Long indexNumber, String imie, String nazwisko) {
        this.indexNumber = indexNumber;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
