public class Bhaskara {
  public void calculate(double a, double b, double c) {
    double delta = Math.pow(b, 2) - (4 * a * c);
    if (delta < 0) {
      System.out.print( "Delta é negativo, não há raízes");
      return;
    }
    double x1 = (- b + Math.sqrt(delta)) / (2 * a);
    double x2 = (- b - Math.sqrt(delta)) / (2 * a);
    System.out.print("x1 = " + x1 + "\nx2 = " + x2);
  }
}
