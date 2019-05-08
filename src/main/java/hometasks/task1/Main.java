package hometasks.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        /* Lights order could be change to any order. For example, the following case corresponds to
          * RED -> YELLOW -> GREEN -> YELLOW ->
          * RED -> YELLOW -> GREEN -> YELLOW -> ... and so on */
        TrafficLight trafficLight = new TrafficLight(
                Lights.RED,
                Lights.YELLOW,
                Lights.GREEN,
                Lights.YELLOW
        );

        try(BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in))) {

            String input = reader.readLine();
            int currentMinute = Integer.parseInt(input);

            System.out.println(trafficLight.getStatus(currentMinute));
        }
        catch (IOException e){ System.out.println("An IOException occured"); }
        catch (NumberFormatException e){ System.out.println("Input supposed to be an integer"); }
        catch (IllegalArgumentException e){ System.out.println("Input supposed to be non-negative"); }
        catch (LogicException e){ System.out.println(e); }
    }
}
