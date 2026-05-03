import javax.swing.*;

public class MainUI {
    public static void main(String[] args) {
        //ReactionTime.reactionTime();

        JFrame frame = new JFrame("SWING");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton button = new JButton();
        button.setSize(100, 100);
        frame.add(button);


        frame.setVisible(true);

        //AimTrainer.AimTrainerCheat();
    }
}