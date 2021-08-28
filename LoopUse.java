//Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate. 

import java.util.*;
public class LoopUse
{
public static void main(String[] args)
{
int number1, number2;
char choice;
Scanner scn = new Scanner(System.in);
do
{
System.out.print("Enter first number: ");
number1 = scn .nextInt();
System. out .print("Enter second number: " );
number2 = scn .nextInt();
System.out.println("Sum of the both numbers is : "+ ( number1 + number2 ));
System.out.print("Do you want to continue to perform the operation  y/n?");
choice = scn .next().charAt(0);
} while (choice == 'y' || choice == 'Y');

}

} 