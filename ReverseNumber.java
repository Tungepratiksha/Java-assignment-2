//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        int num;
        int reversed = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("input the num:");
        num=sc.nextInt();

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed Number is: " +reversed);
}
}