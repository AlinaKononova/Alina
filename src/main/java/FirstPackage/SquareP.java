package FirstPackage;

public class SquareP {
  public double a;
 //пример функции: public static double perimetr(SquareP p){return 4 * p.a;}
  //делаем метод
  //объявляем конкструтор, чтобы в объекте можно было задать значение атрибута
  public SquareP(double a){
    this.a=a;
  }
  //объявляем метод
  public double perimeter(){
    return this.a * 4;
  }
}
