//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

import java.util.Scanner;
class Power {
  public static void main(String[] args) {
  	int base,exponent;
  	int result=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base:");
    base=sc.nextInt();
    System.out.println("Enter the exponent:");
    exponent=sc.nextInt();
    while (exponent != 0) {
      result *= base;
      --exponent;
    }

    System.out.println("Result is:" + result);
  }
}