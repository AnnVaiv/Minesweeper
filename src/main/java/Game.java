import java.util.Scanner;

public class Game {

    String level ;
    int boardSize;
    int mineCount;






    //UserInterface userInterface = new UserInterface();

    public Game(){


        //Board board = new Board();
        //board.make2DArrayBoardFromCells(9,9);


    }









    //----------GETTERS AND SETTERS--------------

    public String getLevel() {
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


}
