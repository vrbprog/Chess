import figures.Color;
import figures.Position;

public class Chess {

    Board playBoard;
    Player whitePlayer;
    Player blackPlayer;

    public Chess(){
        whitePlayer = new Player(Color.WHITE);
        blackPlayer = new Player(Color.BLACK);
        playBoard = new Board();
    }

    public void run(){
        Position posOne = new Position(0,0);
        Position posTree = new Position(0,1);
        Position posTwo = new Position(1,0);
        System.out.println(whitePlayer.moveFigure(playBoard, posOne, posTwo));
        System.out.println(blackPlayer.moveFigure(playBoard, posTree, posTwo));
        System.out.println(whitePlayer.moveFigure(playBoard, posOne, posTwo));
    }
}
