public class Level {

    String level ;
    int boardSize;
    int mineCount;


    public Level(String level, int boardSize, int mineCount) {
        this.level = level;
        this.boardSize = boardSize;
        this.mineCount = mineCount;
    }

    public Level(){

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
