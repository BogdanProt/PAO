package Lab10.Ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Magazin {
    private String numeMagazin;
    private int numarAngajati;

    public Magazin(String numeMagazin, int numarAngajati) {
        this.numeMagazin = numeMagazin;
        this.numarAngajati = numarAngajati;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumeMagazin(String numeMagazin) { this.numeMagazin = numeMagazin; }

    public void setNumarAngajati(int numarAngajati) { this.numarAngajati = numarAngajati; }
}

