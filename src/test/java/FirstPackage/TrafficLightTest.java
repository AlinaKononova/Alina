package FirstPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import trainy.TrafficLightCW;

public class TrafficLightTest {

  @Test
  public void testYellow() {
    TrafficLightCW c = new TrafficLightCW("green");
    Assert.assertEquals(c.updateLight(),"yellow");
  }

  @Test
  public void testRed() {
    TrafficLightCW c = new TrafficLightCW("yellow");
    Assert.assertEquals(c.updateLight(),"red");
  }

  @Test
  public void testGreen() {
    TrafficLightCW c = new TrafficLightCW("red");
    Assert.assertEquals(c.updateLight(),"green");
  }


  @Test
  public void testError() {
    TrafficLightCW c = new TrafficLightCW("dog");
    Assert.assertEquals(c.updateLight(),"Error");
  }

}
