public class Board {
    private int numberOfMines;
    private Cell cell;

    private int columns;
    private int rows;

    public Board(int numberOfMines, Cell cell, int columns, int rows) {
        this.numberOfMines = numberOfMines;
        this.cell = cell;
        this.columns = columns;
        this.rows = rows;
    }

    public Cell[][] make2DArrayBoardFromCells (int columns, int rows){
        Cell[][] cellArray = new Cell[columns][rows];

        for (int i=0; i<columns; i++) {
            for (int j = 0; j<rows;j++){
                cellArray [i][j] = new Cell();
            }
        }
        return cellArray;
    }













    public int getNumberOfMines() {
        return numberOfMines;
    }

    public void setNumberOfMines(int numberOfMines) {
        this.numberOfMines = numberOfMines;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
