package testjava;

import java.util.Scanner;

public class reverseNumber {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER n : ");
            int num = sc.nextInt();
            int reversenum =0;
            while( num != 0 )
            {
                reversenum = reversenum * 10;
                reversenum = reversenum + num%10;
                num = num/10;
            }

            System.out.println("Reverse of the number is: "+reversenum);
        }
    }
