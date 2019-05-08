package hometasks.task1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RYGYTrafficLightPositiveTest {
    private int minute;
    private Lights light;

    /* (Red -> Yellow -> Green -> Yellow -> ...) Traffic Light */
    private TrafficLight trafficLight = new TrafficLight(
            Lights.RED,
            Lights.YELLOW,
            Lights.GREEN,
            Lights.YELLOW
    );

    public RYGYTrafficLightPositiveTest(int minute, Lights light){
        this.minute = minute;
        this.light = light;
    }

    @Parameterized.Parameters(name="{0}, {1}")
    public static Collection<Object[]> data(){
        Object[][] data = new Object[][]{
                {0, Lights.RED},
                {2, Lights.YELLOW},
                {3, Lights.GREEN},
                {6, Lights.YELLOW},
                {7, Lights.RED},
                {9, Lights.YELLOW},
                {1, Lights.RED},
                {5, Lights.GREEN},
                {182, Lights.RED}
        };

        return Arrays.asList(data);
    }

    @Test
    public void getStatusPositiveTest() throws LogicException{
        assertEquals(light, trafficLight.getStatus(minute));
    }
}
