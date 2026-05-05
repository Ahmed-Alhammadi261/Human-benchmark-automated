import java.awt.*;

public class ReactionTime {
    public static void start() {
        final int POSX = 2000;
        final int POSY = 500;
        Robot mouseBot;

        try{
            mouseBot = new Robot();
        } catch (AWTException e) {
            return;
        }

        MouseController.move(mouseBot, POSX, POSY);
        MouseController.click(mouseBot);

        Color targetColor = new Color(75, 219, 106);
        Color pixelColor;

        boolean isDone = false;

        while (!isDone) {
            pixelColor = mouseBot.getPixelColor(POSX, POSY);

            if (pixelColor.equals(targetColor)) {
                MouseController.click(mouseBot);

                isDone = true;
            }
        }
    }
}
