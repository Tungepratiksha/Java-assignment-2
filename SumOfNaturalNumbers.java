//Write a program to calculate the sum of first 10 natural number.

import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String args[]) {

        int i,s=0;

        for(i = 1;i <= 10; i++){
            s = s + i;
        }

        System.out.println("Sum of 5 natural numbers:"+s);

    }
}