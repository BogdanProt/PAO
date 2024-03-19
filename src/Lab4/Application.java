package Lab4;
import Lab4.Patrulater;
import Lab4.Cerc;

public class Application {
    public static void main(String[] args) {
        Cerc cerc = new Cerc(5);
        Patrulater patrulater = new Patrulater(3, 4, 5, 6);

        //Calcul cerc2 = new Cerc(3);

        System.out.println("Perimetrul cercului: " + cerc.calculPerimetru());
        System.out.println("Perimetrul patrulaterului: " + patrulater.calculPerimetru());

    }
}
