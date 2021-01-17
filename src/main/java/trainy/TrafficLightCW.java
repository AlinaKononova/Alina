package trainy;

public class TrafficLightCW {
  //public static void main(String[] args) {
    //System.out.println(updateLight("red"));
    //System.out.println(age(15));}

 static String color = "";
  public TrafficLightCW(String s){
    color = s;
  }

  public String updateLight() {

    if (color.equals("green")) {
      return y();
    } else if (color.equals("yellow")) {
      return r();
    } else if (color.equals("red")) {
      return g();
    }
    return "Error";
  }

 public static String y() {
    return "yellow";
 }

  public static String r() {
    return "red";
  }

  public static String g() {
    return "green";
  }

  //public static String age(int age) {
    //if (age < 16 || age > 65) {
      //return "Free fare";
   // } else {
      //return "Pay fare";
   // }
  //}
}
