public class Number {
  public void identify(int number) {
    checkEvenOrOdd(number);
    checkPositiveOrNegative(number);
  }

  private void checkEvenOrOdd(int number) {
    if (number == 0) {
      System.out.println(String.format("%d é neutro", number));
    } else if (number % 2 == 0) {
      System.out.println(String.format("%d é par", number));
    } else {
      System.out.println(String.format("%d é ímpar", number));
    }
  }

  private void checkPositiveOrNegative(int number) {
    if (number > 0) {
      System.out.println(String.format("%d é positvo", number));
    } else {
      System.out.println(String.format("%d é negativo", number));
    }
  }
}
