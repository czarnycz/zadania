package zadaniaDomowe.zajecia2.zad4;

import java.util.Objects;

public class ParaLiczb {
    int liczbaA;
    int liczbaB;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParaLiczb paraLiczb = (ParaLiczb) o;
        return liczbaA == paraLiczb.liczbaA && liczbaB == paraLiczb.liczbaB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(liczbaA, liczbaB);
    }

    @Override
    public String toString() {
        return "ParaLiczb{" +
                "liczbaA=" + liczbaA +
                ", liczbaB=" + liczbaB +
                '}';
    }

    public int getLiczbaA() {
        return liczbaA;
    }

    public void setLiczbaA(int liczbaA) {
        this.liczbaA = liczbaA;
    }

    public int getLiczbaB() {
        return liczbaB;
    }

    public void setLiczbaB(int liczbaB) {
        this.liczbaB = liczbaB;
    }

    public ParaLiczb(int liczbaA, int liczbaB) {
        this.liczbaA = liczbaA;
        this.liczbaB = liczbaB;
    }
}
