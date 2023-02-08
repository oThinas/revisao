public class BMI {
  public void printResult(double weight, double height) {
    double bmi = calculateBMI(weight, height);
    String result = calculateResult(bmi);
    System.out.println(String.format("Com %4.2f, você se encaixa na categoria: %s", bmi, result));
  }
  
  private double calculateBMI(double weight, double height) {
    double bmi = weight / (height * height);

    return bmi;
  }

  private String calculateResult(double bmi) {
    String result = "";
    if (bmi < 18.5) result = "Abaixo do peso";
    else if (bmi >= 18.5 && bmi < 25) result = "Peso normal";
    else if (bmi >= 25 && bmi < 30) result = "Acima do peso";
    else if (bmi >= 30 && bmi < 35) result = "Obesidade grau 1";
    else if (bmi >= 35 && bmi < 40) result = "Obesidade grau 2";
    else result = "Obesidade grau 3";

    return result;
  }
}
