package trainy;

public class Cat {
  String catname;
  int catweight;
  String catvoice;
  String catcolour;

  Cat(String name, int catweight, String voice, String colour){
    catname = name;
    this.catweight = catweight;
    catvoice = voice;
    catcolour = colour;
  }

  Cat(String name){
    catname = name;
  }

  public String specificcat(){
    return catname + " " + catvoice + " " + catcolour + " " + catweight;
  }

  public String myau(){
    return "myau";
  }
}
