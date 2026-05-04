import java.awt.*;
import java.awt.event.InputEvent;

public class LeftClick {
    public static void click(Robot mouse) {

        mouse.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        mouse.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
