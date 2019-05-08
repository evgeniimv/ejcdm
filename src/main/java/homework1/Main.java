package homework1;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    private static void printColor(Color color) {
        switch (color) {
            case RED:
                System.out.println("Red");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            case YELLOW:
                System.out.println("Yellow");
                break;
            default:
                System.out.println("Default branch");
        }
    }

    public static void main(String[] args) {
        try {
            TrafficLight light = new TrafficLight(new LinkedHashMap<Color, Long>() {{
                put(Color.RED, 2L);
                put(Color.YELLOW, 1L);
                put(Color.GREEN, 3L);
            }});

            System.out.println("Enter minute: ");
            Scanner scanner = new Scanner(System.in);

            long minute = scanner.nextLong();
            Color color = light.getColorAtTime(minute);
            printColor(color);
        } catch (InputMismatchException ex) {
            System.out.println("Incorrect input");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
