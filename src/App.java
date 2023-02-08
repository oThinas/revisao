public class App {
  public static void main(String[] args) throws Exception {
    int number = 0;
    Number numberObject = new Number();
    numberObject.identify(number);

    Fibonacci fibonacci = new Fibonacci();
    fibonacci.printFibonacci(10);

    BMI bmi = new BMI();
    bmi.printResult(50.5, 1.68);

    Bhaskara bhaskara = new Bhaskara();
    bhaskara.calculate(3, -15, 12);
  }
}
