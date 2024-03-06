package Lab2;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Exercitiul3 {


    public static void main(String[] args) {

        nthFibonacci();

    }

    private static void nthFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Al catelea termen Fibonacii vrei sa aflii? Introdu un numar:");
        int n = scanner.nextInt();
        int last, lastLast, current;
        int nr = 2;
        if (n == 1)
        {
            System.out.println("Primul termen Fibonacci este: " + 0);
        }
        else if (n == 2)
        {
            System.out.println("Al doilea termen Fibonacci este: " + 1);
        }
        else{
            current = 0;
            lastLast = 0;
            last = 1;
            while (nr < n)
            {
                nr = nr + 1;
                current = last + lastLast;
                lastLast = last;
                last = current;
            }
            System.out.println("Al " + n + "-lea termen Fibonacci este: " + current);
        }

    }
}
