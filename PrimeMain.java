//Java Program to Check Whether a Number can be Express as Sum of Two Prime Numbers
public class  PrimeMain {

  public static void main(String[] args) {
    int number = 24;
    boolean flag = false;
    for (int i = 2; i <= number / 2; ++i) {

      
      if (checkPrime(i)) {

        
        if (checkPrime(number - i)) {

          
          System.out.printf("%d = %d + %d\n", number, i, number - i);
          flag = true;
        }

      }
    }

    if (!flag)
      System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
  }

  
  static boolean checkPrime(int num) {
    boolean isPrime = true;

    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }

    return isPrime;
  }
}