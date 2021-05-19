import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame implements ActionListener {
    //these need to be connected with main or to LevelSelection Class
    String level = "Beginner";
    int boardSize=9;
    int mineCount=10;

    int cellSize = 40;


    JButton[][] cellButtons = new JButton[boardSize][boardSize];
    JButton startAgainButton =new JButton();
    JPanel topPanel;
    JPanel cellPanel;
    Font myFont = new Font("Ink Free", Font.PLAIN, 30);
    JFrame frame = new JFrame("Minesweeper");

    //UserInterface userInterface = new UserInterface();

    public Game(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(cellSize*boardSize+20, cellSize*boardSize+60+40);
        frame.setLayout(null);
        frame.setResizable(false);

        startAgainButton = new JButton("start again");
        //startAgainButton.addActionListener(this);
        startAgainButton.setFont(myFont);
        startAgainButton.setFocusable(false);

        //System.out.println("Test for level data"+getLevel());
        //Board board = new Board();
        //board.make2DArrayBoardFromCells(9,9);

        /*for (int i = 0; i<boardSize;i++){
            for (int j = 0; j<boardSize;j++){
                //cellButtons[i][j].addActionListener(this);
                //cellButtons[i][j].setFocusable(false);
            }
        }*/

        topPanel =new JPanel();
        topPanel.setBounds(0,0,cellSize*boardSize,60);
        topPanel.add(startAgainButton);
        topPanel.setBackground(Color.blue);


        cellPanel =new JPanel();
        cellPanel.setBounds(0,60,cellSize*boardSize+5,cellSize*boardSize+5);
        cellPanel.setBackground(Color.pink);
        cellPanel.setLayout(new GridLayout(boardSize,boardSize));


        for( int y=0 ; y<boardSize ; y++ )
        {
            for( int x=0 ; x<boardSize ; x++ )
            {
                cellButtons[x][y] = new JButton("");

                cellPanel.add(cellButtons[x][y]);
            }
        }





        frame.add(topPanel);
        frame.add(cellPanel);
        frame.setVisible(true);

        this.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


    //----------GETTERS AND SETTERS--------------

   /* public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public int getBoardSize() {
        return boardSize;
    }
    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }
    public int getMineCount() {
        return mineCount;
    }
    public void setMineCount(int mineCount) {
        this.mineCount = mineCount;
    }
*/

}
