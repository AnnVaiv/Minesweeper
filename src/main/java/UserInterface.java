import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class UserInterface extends JFrame {
    int spacing = 1;
    int cellSize = 30;
    int topRowHeight = 50;
    int cellCount = ;//need to change accordingly to difficulty

    int mx;
    int my;


    public UserInterface() {
        this.setTitle("Minesweeper");
        this.setSize(cellSize * cellCount + 7 + 7, cellSize * cellCount + topRowHeight + 30 + 7);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);

        Panel setPanel = new Panel();
        this.setContentPane(setPanel);

        Move move = new Move();
        this.addMouseMotionListener(move);
        Click click = new Click();
        this.addMouseListener(click);

    }

    public class Panel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.darkGray);
            g.fillRect(0, 0, cellSize * cellCount, cellSize * cellCount + topRowHeight);

            for (int i = 0; i < cellCount; i++) {
                for (int j = 0; j < cellCount; j++) {
                    g.setColor(Color.gray);
                    if (mx >= spacing + i * cellSize && mx < spacing + i * cellSize + cellSize - 2 * spacing &&
                            my >= spacing + j * cellSize + topRowHeight && my <= spacing + j * cellSize + topRowHeight + cellSize - 2 * spacing) {
                        g.setColor(Color.red);
                    }

                    g.fillRect(spacing + i * cellSize, spacing + j * cellSize + topRowHeight, cellSize - 2 * spacing, cellSize - 2 * spacing);
                }
            }

        }

    }

    public class Move implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            mx = e.getX();
            my = e.getY();
            System.out.println("X:" + mx + "\tY:" + my);

        }
    }

    public class Click implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }









    /*int boardSize;
    int mineCount;
    public static void SetFrame(){
        JFrame frame = new JFrame("Minesweeper");
        JPanel panel = new JPanel();
        //panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Select difficulty:");
        panel.add(label);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/




    /*public static void selectDifficulty() {
        JFrame frame = new JFrame("Minesweeper");
        JPanel panel = new JPanel();
        //panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Select difficulty:");
        panel.add(label);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton beginner = new JButton("Beginner");
        JButton intermediate = new JButton("Intermediate");
        JButton advanced = new JButton("Advanced");

        panel.add(beginner);
        panel.add(intermediate);
        panel.add(advanced);

        beginner.addActionListener((ActionEvent) ->{

            boardSize = 9;
            mineCount = 10;});
        //intermediate.addActionListener(Game.SetDifficulty("intermediate"));
        //advanced.addActionListener(Game.SetDifficulty("advanced"));
    }
*/


}

