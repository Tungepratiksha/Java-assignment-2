//Java program to Calculate Factorial of a Number Using Recursion
public class FactorialOfNumber {

    public static void main(String[] args) {
        int num = 7;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num +  " is: " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}