import java.util.Scanner;

public class Game {
    UserInterface userInterface = new UserInterface();
    public Game(){


       /* System.out.println("Choose level: 1 / 2 / 3");
        Integer input = Integer.parseInt(scanner.nextLine());
        if (input == 1){
            level = "Beginner";
        }else if (input == 2){
            level = "Intermediate";
        } else if (input == 3){
            level = "Advanced";
        }*/
        //choseLevel(level);

        //UserInterface.selectDifficulty();
        SetDifficulty("beginner");

    }


    Scanner scanner = new Scanner(System.in);

    String level ;
    int boardSize;
    int mineCount;

    public int getBoardSize() {
        return boardSize;
    }

    public int getMineCount() {
        return mineCount;
    }

    public void SetDifficulty(String level) {
        if (level.equalsIgnoreCase("beginner")) {
            boardSize = 9;
            mineCount = 10;
        } else if (level.equalsIgnoreCase("intermediate")) {
            boardSize = 16;
            mineCount = 40;
        } else if (level.equalsIgnoreCase("advanced")) {
            boardSize = 24;
            mineCount = 99;
        }

        System.out.println( "Selected difficulty:"+level+"  size:"+boardSize+"  mines:"+mineCount);

    }




}
