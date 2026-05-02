import java.awt.*;
import java.util.Scanner;

public class tempo {
    public static void main(String[] args) {
        Robot robot;

        try{
            robot = new Robot();
        } catch (AWTException e) {
            return;
        }

        Point p = MouseInfo.getPointerInfo().getLocation();
        int x = (int) p.getX();
        int y = (int) p.getY();

        System.out.println("Mouse Position: " + x + ", " + y);

        Color getColor;

        Scanner stall = new Scanner(System.in);
        stall.nextLine();

        getColor = robot.getPixelColor(x, y);
        System.out.println(getColor);

    }
}