package testjava;
import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n1: ");
        int n1 = sc.nextInt();
        System.out.println("enter n2: ");
        int n2 = sc.nextInt();
        int hcf = hcf(n1, n2);
        int lcm = n1 * n2 / hcf;

        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
        System.out.println();
        System.out.printf("L.C.M of %d and %d is %d.", n1 , n2 ,lcm);
    }

    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
}