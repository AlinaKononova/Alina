package FirstPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import trainy.TrafficLight;

public class TrafficLightTest {

  @Test
  public void testYellow() {
    TrafficLight c = new TrafficLight("green");
    Assert.assertEquals(c.updateLight(),"yellow");
  }

  @Test
  public void testRed() {
    TrafficLight c = new TrafficLight("yellow");
    Assert.assertEquals(c.updateLight(),"red");
  }

  @Test
  public void testGreen() {
    TrafficLight c = new TrafficLight("red");
    Assert.assertEquals(c.updateLight(),"green");
  }


  @Test
  public void testError() {
    TrafficLight c = new TrafficLight("dog");
    Assert.assertEquals(c.updateLight(),"Error");
  }

}
