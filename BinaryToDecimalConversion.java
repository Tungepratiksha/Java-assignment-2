//Java Program to Convert Binary Number to Decimal and vice-versa
class BinaryToDecimalConversion{
    
  public static void main(String[] args) {

   
    long num = 1111;

    
    int decimal = convertBinaryToDecimal(num);

    System.out.println("Binary to Decimal Conversion");
    System.out.println(num + " = " + decimal);
  }

  public static int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
  }
} 