//Java Program to Calculate Power of a Number
class PowerOfANum {
  public static void main(String[] args) {

    int base = 4,  exponent = 2;

    long result = 1;

    while (exponent != 0) {
      result *= base;
      --exponent;
    }

    System.out.println("Power = " + result);
  }
}
