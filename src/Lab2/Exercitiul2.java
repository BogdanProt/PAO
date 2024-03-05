package Lab2;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Exercitiul2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int[] a = new int[3];
        for (int i=0; i<3; i++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[0] + " < " + a[1] + " < " + a[2]);
    }
}
