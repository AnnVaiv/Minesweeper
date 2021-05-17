import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LevelSelection extends JFrame implements ActionListener {
    JButton[] levelButtons = new JButton[3];
    JButton beginnerButton, intermediateButton, advancedButton;
    JPanel panel;
    Font myFont = new Font("Ink Free", Font.PLAIN, 30);
    JFrame frame = new JFrame("Difficulty");


    LevelSelection() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setResizable(false);

        beginnerButton = new JButton("Beginner");
        intermediateButton = new JButton("Intermediate");
        advancedButton = new JButton("Advanced");

        levelButtons[0] = beginnerButton;
        levelButtons[1] = intermediateButton;
        levelButtons[2] = advancedButton;

        for (int i = 0; i < 3; i++) {
            levelButtons[i].addActionListener(this);
            levelButtons[i].setFont(myFont);
            levelButtons[i].setFocusable(false);

        }

        panel = new JPanel();
        panel.setBounds(20, 20, 246, 224);
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        //panel.setBackground(Color.blue);

        panel.add(levelButtons[0]);
        panel.add(levelButtons[1]);
        panel.add(levelButtons[2]);

        frame.add(panel);
        frame.setVisible(true);


        //this.setTitle("Select difficulty");
        this.setResizable(false);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 3; i++) {
            if (e.getSource() == levelButtons[i]) {
                setDifficulty(i);
                LevelSelection.this.frame.setVisible(false);
            }
        }

    }


    public void setDifficulty(int input) {
        Level level = new Level();
        if (input == 0) {
            level.setLevel("Beginner");
            level.setBoardSize(9);
            level.setMineCount(10);
        } else if (input == 1) {
            level.setLevel("Intermediate");
            level.setBoardSize(16);
            level.setMineCount(40);
        } else if (input == 2) {
            level.setLevel("Advanced");
            level.setBoardSize(24);
            level.setMineCount(99);

        }

        System.out.println("Selected difficulty:" + level.getLevel() + "  size:" + level.getBoardSize() + "  mines:" + level.getMineCount());


    }


}

