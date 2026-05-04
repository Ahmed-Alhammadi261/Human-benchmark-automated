import java.awt.*;
import java.awt.image.BufferedImage;

public class AimTrainer {
    public static void start() {

        Robot screenCapture;
        try {
            screenCapture = new Robot();
        } catch (AWTException e) {
            return;
        }


        boolean isDone = false;

        Rectangle captureArea = new Rectangle(794, 134, 1016, 583);
        BufferedImage playArea;

        Color targetColor = new Color(230, 232, 244);
        Color targetColorTrans = new Color(149, 195,232);
        Color endColor = new Color(255, 209, 84);


        while (!isDone) {

            playArea = screenCapture.createScreenCapture(captureArea);

            search:
            for (int i = 0; i < playArea.getWidth(); i++) {
                for (int j = 0; j < playArea.getHeight(); j++) {

                    Color pixelColor = new Color(playArea.getRGB(i, j));

                    if (pixelColor.equals(endColor)) {
                        isDone = true;
                        break search;
                    }

                    if (pixelColor.equals(targetColor) || pixelColor.equals(targetColorTrans)) {
                        MoveMouse.move(screenCapture ,captureArea.x + i, captureArea.y + j);
                        LeftClick.click(screenCapture);

                        break search;
                    }
                    j += 25;
                }
                i += 25;
            }
        }
    }
}
