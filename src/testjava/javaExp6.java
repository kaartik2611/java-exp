package testjava;

import java.util.Scanner;

public class javaExp6 {
    public static void main(String[] args) {

        System.out.println("MENU-DRIVEN PROGRAM FOR LEARNING RECURSION");
        System.out.println();
        System.out.println("SELECT ANY ONE OUT OF THE FOUR OPTIONS: ");
        System.out.println();
        System.out.println("  1. GCD and LCM of two numbers: ");
        System.out.println("  2.Fibonacci numbers for a given number 'n':");
        System.out.println("  3.To Print the number in reverse order:");
        System.out.println("  4. To Print Sum Of First 'n' Natural Numbers: ");

        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();
        boolean l = true;
        while (l)
            switch (select){
                case 1:
                    System.out.println("U HAVE SELECTED OPTION 1");
                    l=false;
                    break;
                case 2:
                    System.out.println("U HAVE SELECTED OPTION 2");
                    l=false;
                    break;
                case 3:
                    System.out.println("U HAVE SELECTED OPTION 3");
                    l=false;
                    break;
                case 4:
                    System.out.println("U HAVE SELECTED OPTION 4");
                    l=false;
                    break;
                default:
                    System.out.println("U HAVE SELECTED A WRONG CHOICE.");

                    break;
            }
    }
}
