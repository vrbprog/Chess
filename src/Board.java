import figures.Color;
import figures.Field;
import figures.Figure;
import figures.Pawn;

public class Board {
    Field[][] board;

    public Board() {
        board = new Field[8][8];
        loadFields();
        loadFigures();
    }

    public Field[][] getBoardView(Color playerColor){
        return board;
    }

    private void loadFields(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Field();
            }
        }
    }

    private void loadFigures() {
        for (int i = 0; i < 8; i++) {
            board[0][i].setFigure(new Pawn(Color.WHITE));
        }
    }
}
