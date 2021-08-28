//Java Program to Display Factors of a Number
import java.util.Scanner;
public class FactorsOfNumber {

  public static void main(String[] args) {

   
    int num;
    Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
num=sc.nextInt();
    System.out.print("Factors of num are: ");

   
    for (int i = 1; i <= num; ++i) {

      if (num % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}