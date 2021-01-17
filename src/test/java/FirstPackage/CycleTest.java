package FirstPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CycleTest {

  @Test
  public static void testOne () {
    Assert.assertTrue(Cycle.cycleFor(Integer.MAX_VALUE));
  }

  @Test
  public static void testTwo () {
    Assert.assertFalse(Cycle.cycleFor(Integer.MAX_VALUE - 2));
  }

}
