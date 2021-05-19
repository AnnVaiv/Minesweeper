public class Board {
    private int numberOfMines;
    private Cell cell;

    private int columns;
    private int rows;
    private Cell[][] cellArray;

    public Board(/*int numberOfMines, int columns, int rows*/) {
        this.numberOfMines = numberOfMines;
        this.columns = columns;
        this.rows = rows;

        make2DArrayBoardFromCells();

        setMines();

        countNeighbouringMines();


    }




    public void make2DArrayBoardFromCells (){
        Cell[][] cellArray = new Cell[columns][rows];

        for (int i=0; i<columns; i++) {
            for (int j = 0; j<rows;j++){
                cellArray [i][j] = new Cell();
            }
        }
        System.out.println(cellArray);
        //return cellArray;
    }

    private void setMines() {

        int x;
        int y;
        boolean isMine;
        int currentMines = 0;

        while (currentMines != numberOfMines)
        {
            x = (int)Math.floor(Math.random() * columns);

            y = (int)Math.floor(Math.random() * rows);

            isMine = cellArray[x][y].isMine();

            if(!isMine)
            {
                cellArray[x][y].setMine(true);
                currentMines++;
            }
        }
    }



    private void countNeighbouringMines() {

        for(int x = 0 ; x < columns ; x++)
        {
            for(int y = 0 ; y < rows ; y++)
            {
                cellArray[x][y].setNeighbouringMines(counting(x,y));
            }
        }

    }

    private int counting(int x, int y) {
        int neighbours = 0;

        for(int i=1; i<=x; i++){
            for(int j=1; j<=y; j++)
            {
                // Skip (xCo, yCo), since that's no neighbour.
                if(x != xCo || y != yCo)
                    if(cellArray[x][y].getMine())   // If the neighbour contains a mine, neighbours++.
                        neighbours++;
            }
        }

        return neighbours;



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
