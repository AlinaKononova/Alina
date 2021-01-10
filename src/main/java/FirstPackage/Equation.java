package FirstPackage;

public class Equation {
  private double a;
  private double b;
  private double c;
  //задали атрибут для определения количества корней
  private int n;

  //1-й шаг: делаем конструктор
  public Equation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
    double d = b * b - 4 * a * c;

    if (d > 0) {
      n = 2;
    } else if (d == 0) {
      n = 1;
    } else {
      n = 0;
    }
  }
  public int number () {
    return n;
  }
}