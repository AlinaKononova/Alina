package test;

public class Test {

  public static void main(String[] args) {
    System.out.println("Happy New Year!");
    System.out.println("New York" + " " + "20" + "21");
    movie("'Девчата'.");
    double R=5;
    double P=3.14;
    System.out.println("Area of circle = " + area(R, P));
  }

  public static void movie(String something) {
    System.out.println("One is my favorite movie is" + " " + something);
  }
  public static double area(double R, double P){
    return P * R * R;
  }
}
