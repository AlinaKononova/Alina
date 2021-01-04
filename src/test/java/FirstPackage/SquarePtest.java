package FirstPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquarePtest {

  @Test
  public void methodSquare(){
    SquareP P1 = new SquareP(5);
    Assert.assertEquals(P1.perimeter(), 30);
  }
}
