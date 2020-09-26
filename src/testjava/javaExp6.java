package testjava;

import java.util.Scanner;

public class javaExp6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("MENU-DRIVEN PROGRAM FOR LEARNING RECURSION");
            System.out.println();
            System.out.println("SELECT ANY ONE OUT OF THE FOUR OPTIONS: ");
            System.out.println();
            System.out.println("  1. GCD and LCM of two numbers: ");
            System.out.println("  2.Fibonacci numbers for a given number 'n':");
            System.out.println("  3.To Print the number in reverse order:");
            System.out.println("  4. To Print Sum Of First 'n' Natural Numbers: ");
            System.out.println("  5.EXIT");
            select = sc.nextInt();

            switch (select) {

                case 1:
                    System.out.println("U HAVE SELECTED OPTION 1");

                    System.out.println("enter n1: ");
                    int n1 = sc.nextInt();
                    System.out.println("enter n2: ");
                    int n2 = sc.nextInt();
                    int hcf = hcf(n1, n2);
                    int lcm = n1 * n2 / hcf;

                    System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
                    System.out.println();
                    System.out.printf("L.C.M of %d and %d is %d.", n1, n2, lcm);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("U HAVE SELECTED OPTION 2");
                    System.out.println("enter the value of n :");
                    int numb = sc.nextInt();
                    System.out.println("Fibonacci series upto " + numb +" numbers : ");
                    System.out.println();
                    for(int i=1; i<=numb; i++){
                        System.out.print(fibonacci(i) +" ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("U HAVE SELECTED OPTION 3");

                    System.out.println("ENTER n : ");
                    int num = sc.nextInt();
                    int reversenum = 0;
                    while (num != 0) {
                        reversenum = reversenum * 10;
                        reversenum = reversenum + num % 10;
                        num = num / 10;
                    }

                    System.out.println("Reverse of the number is: " + reversenum);
                    System.out.println();

                    break;
                case 4:
                    System.out.println("U HAVE SELECTED OPTION 4");

                    System.out.println("enter the number: ");
                    int number = sc.nextInt();
                    int sum = addNumbers(number);
                    System.out.println("Sum = " + sum);

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("U HAVE SELECTED A WRONG CHOICE.");
                    break;
            }
        } while (select != 5);
    }

    private static int hcf(int n1, int n2) {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }

    private static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }

    private static int fibonacci(int numb){
        if(numb == 1 || numb == 2){
            return 1;
        }
        return fibonacci(numb-1) + fibonacci(numb -2);
    }
}
