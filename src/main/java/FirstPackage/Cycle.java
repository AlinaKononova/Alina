package FirstPackage;

public class Cycle {

  public static boolean cycleFor (int n) {
    for (int i = 2; i < n; i ++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean cycleWhile (int n) {
    int i = 2;
    while (i < n) {
      if (n % i == 0) {
        return false;
      }
      i++;
    }
    return true;
  }

  public static boolean cycleWhileOther (int n) {
    int i = 2;
    while (i < n && n % 1 != 0) {
      return false;
    }
    return i == n;
  }

}
