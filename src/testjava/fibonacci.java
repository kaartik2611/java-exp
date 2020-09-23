package testjava;

import java.util.Scanner;

public class fibonacci {
    static int n1=0,n2=1,n3=0;
    static void nFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            nFibonacci(count-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int count = sc.nextInt();
        System.out.print(n1+" "+n2);//printing 0 and 1      
        nFibonacci(count-2);//n-2 because 2 numbers are already printed
    }
}