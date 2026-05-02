import java.awt.*;

public class MoveMouse {
    public static void moveMouse(int POSX, int POSY) {

        Robot mouseMoveTo;

        try {
            mouseMoveTo = new Robot();
        } catch (AWTException e) {
            return;
        }

        mouseMoveTo.mouseMove(POSX, POSY);

    }
}
