package trainy;

public class Dog {
  //класс
  String dogName="";
  int age=0;
  //объект
  Dog(String name, int age){
    dogName = name;
    this.age = age;
  }
//методы
  public String getName(){
    return dogName;
  }
  public int getAge(){
    return age;
  }

  public String gavgav(){
    return "gavgav";
  }
}

