//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. 

import java.util.Scanner;
public class PrimeCheck{
public static void main(String args[]){
int i,m=0,flag=0;
int n;

Scanner sc=new Scanner(System.in);
System.out.print("Input a positive integer:");
n=sc.nextInt();
if(n==0||n==1){
System.out.println(n+" is not a prime number.");
}
else{
for(i=2;i<=m;i++){
if(n%i==0){
System.out.println(n+" is not a prime number.");
flag=1;
break;
}
}
if(flag==0) { System.out.println(n+" is a prime number."); }
}
}
}