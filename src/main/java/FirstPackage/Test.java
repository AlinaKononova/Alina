package FirstPackage;

public class Test {

  public static void main(String[] args) {
    System.out.println("Happy New Year!");
    System.out.println("New York" + " " + "20" + "21");
    movie("'Девчата'.");
    double R=5;
    double P=3.14;
    System.out.println("Area of circle = " + area(R, P));

    //п. 1.1 создаем объект "SquareS"
    SquareS s = new SquareS();
    //устанавливаем значение атрибута s.l
    s.l=5;
    System.out.println("Area of Square is" + " " + areaSquare(s));
    //почему используется путь: класс+метод+объект = когда много параметров, легче передать объект в метод, чем много параметров

    //п. 1.2 создаем объект "RectangleS" и поскольку в классе RectangleS задан конструктор, значение атрибутов a и b
    // передаем непосредственно в объекте
    RectangleS r = new RectangleS(4, 5);
    System.out.println("Area of Rectangle is" + " " + areaRectangle(r));
  }

  public static void movie(String something) {
    System.out.println("One is my favorite movie is" + " " + something);
  }
  public static double area(double R, double P){
    return P * R * R;
  }

  //создаем функцию/метод,которая принимает объект "SquareS". 's' - задали название объекта
  public static double areaSquare(SquareS s) {
    //прописываем доступ к атрибуту объекта
    return s.l * s.l;
    //передаем объект "SquareS" см. п. 1.1
  }
  //создаем функцию/метод,которая принимает объект "SquareS". 's' - задали название объекта
  public static double areaRectangle(RectangleS r) {
    //прописываем доступ к атрибуту объекта
    return r.a * r.b;
    //передаем объект "SquareS" см. п. 1.2
  }

}
