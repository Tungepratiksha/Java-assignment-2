//Java Program to Check Whether a Number is Prime or Not
import java.util.Scanner;
public class PrimeOrNot {

  public static void main(String[] args) {

    int num = 29;
    boolean flag = false;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    num=sc.nextInt();
    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}