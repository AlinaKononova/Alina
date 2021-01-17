package FirstPackage;

import java.util.Arrays;
import java.util.List;

public class Collection {

  public static void main (String[] args){
    String[] lang = {"Java", "C#", "Python", "PHP"};

    for (int i = 0; i < lang.length - 1; i++){
      System.out.println("I want learning " + lang[i]);
    }
//более короткий вариант for с массивом
    for (String l: lang) {
      System.out.println("I want learning " + l);
    }
//коллекция
    List<String> language = Arrays.asList("English", "French", "Italian");
    for (String la : language){
      System.out.println("I want speaking " + la);
    }
  }


}
