import java.awt.*;
import java.awt.image.BufferedImage;

public class VisualMemory {
    public static void main(String[] args) {

        Robot robot;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            return;
        }


        Rectangle captureArea = new Rectangle(1089, 257, 406, 406);
        BufferedImage playArea;


        Color whiteBox = new Color(255, 255, 255);
        Color boxColor = new Color(37, 115,193);
        Color gapColor = new Color(43, 135, 209);


        playArea = robot.createScreenCapture(captureArea);

        int x = 0;

        Color previousColor = new Color(playArea.getRGB(0, 0));

        for (int i = 0; i < playArea.getHeight(); i ++){

            int j = 0;

            Color pixelColor = new Color(playArea.getRGB(j, i));

            if (!previousColor.equals(gapColor) && pixelColor.equals(gapColor)) {
                x++;

                MouseController.move(robot ,captureArea.x + i, captureArea.y + j);
                System.out.println(pixelColor);
            }
            previousColor = pixelColor;
        }
        int y = x + 1;
        System.out.println(y*y);
    }
}