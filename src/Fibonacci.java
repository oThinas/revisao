public class Fibonacci {
  public void printFibonacci(int count) {
    long first = 0;
    long second = 1;
    long next = 0;
    System.out.println(first);
    System.out.println(second);
    for (int i = 0; i < count; i++) {
      next = first + second;
      System.out.println(next);
      first = second;
      second = next;
    }
  }
}
