import javax.swing.*;
import java.awt.*;

public class MainUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("MainUI");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton aimTrainerButton = new JButton("Aim trainer");
        aimTrainerButton.setPreferredSize(new Dimension(100, 100));
        aimTrainerButton.addActionListener(e -> AimTrainer.start());

        JButton reactionTimeButton = new JButton("Reaction time");
        reactionTimeButton.setPreferredSize(new Dimension(100, 100));
        reactionTimeButton.addActionListener(e -> ReactionTime.start());

        frame.add(reactionTimeButton);
        frame.add(aimTrainerButton);
        frame.setVisible(true);

    }
}
