package FirstPackage;

public class RectangleS {
//описываем атрибуты, которыми обладает объект типа, который описывает этот класс
  public double a;
  public double b;
  //использование конструкттора, который является псевдофункцией -> значение атрибутов сможем передать непосредственно в объекте,
// например, Object(значение1, значение2..)
  public RectangleS(double a, double b) {
    this.a = a;
    this.b = b;
  };

}
