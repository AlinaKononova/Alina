package trainy;

public class Main {
  public static void main(String[] args) {
    Dog crem = new Dog("Crem", 10);
    System.out.println(crem.getName() + " age = " + crem.getAge() + crem.gavgav());
    Cat A = new Cat("Tom", 5, "calm", "white");
    System.out.println("John has the cat " + A.specificcat() + " " + A.myau());
    System.out.println(feast("cat", "cut"));
  }
  public static boolean feast(String beast, String dish) {
    return beast.charAt(0)==dish.charAt(0) &&
            beast.charAt(beast.length()-1)==dish.charAt(dish.length()-1);
  }


}
