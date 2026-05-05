import java.awt.*;
import java.awt.event.InputEvent;

public class MouseController {
    public static void click(Robot mouse) {

        mouse.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        mouse.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void move(Robot mouse , int POSX, int POSY) {
        mouse.mouseMove(POSX, POSY);
    }
}
