package Lab10.Ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Magazin> magazine = Arrays.asList(
                new Magazin("Magazin A", 5),
                new Magazin("Magazin B", 8),
                new Magazin("Magazin C", 5),
                new Magazin("Magazin D", 10),
                new Magazin("Magazin E", 8)
        );

        //1:
        Map<Integer, List<Magazin>> magazineGrupate = magazine.stream()
                .collect(Collectors.groupingBy(Magazin::getNumarAngajati));

        System.out.println("Magazine grupate dupa nr de angajati:");
        magazineGrupate.forEach((numarAngajati, listaMagazine) -> {
            System.out.println("Nr angajati: " + numarAngajati);
            listaMagazine.forEach(magazin -> System.out.println("\t" + magazin.getNumeMagazin()));
        });

        //2:
        int sumaAngajati = magazine.stream()
                .mapToInt(Magazin::getNumarAngajati)
                .sum();
        System.out.println("Suma angajatilor din toate magazinele: " + sumaAngajati);
    }
}
