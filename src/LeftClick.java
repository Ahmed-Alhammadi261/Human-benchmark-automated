import java.awt.*;
import java.awt.event.InputEvent;

public class LeftClick {
    public static void mouseLeftClick() {

        Robot leftClick;

        try {
            leftClick = new Robot();
        } catch (AWTException e) {
            return;
        }

        leftClick.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        leftClick.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
