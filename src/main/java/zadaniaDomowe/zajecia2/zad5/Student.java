package zadaniaDomowe.zajecia2.zad5;

public class Student {
    private Long nrIndeksu;
    private String imie;
    private String nazwisko;
    private Plec plec;

    @Override
    public String toString() {
        return "Student{" +
                "nrIndeksu=" + nrIndeksu +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                '}';
    }

    public Long getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(Long nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
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

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public Student(Long nrIndeksu, String imie, String nazwisko, Plec plec) {
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }
}
