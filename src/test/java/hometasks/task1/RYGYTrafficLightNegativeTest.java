package hometasks.task1;

import org.junit.Test;

public class RYGYTrafficLightNegativeTest {

    private TrafficLight trafficLight = new TrafficLight(
            Lights.RED,
            Lights.YELLOW,
            Lights.GREEN,
            Lights.YELLOW
    );

    @Test(expected = IllegalArgumentException.class)
    public void getStatusNegativeTest() throws LogicException{
        trafficLight.getStatus(-123);
    }
}
