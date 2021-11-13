import figures.Color;
import figures.Position;

public class Player {

    Color color;

    public Player(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean moveFigure(Board board, Position start, Position end) {
        boolean verification = false;
        boolean ver1 = false, ver2 = false, oppo = false;

        if (board.getBoardView(color)[start.getRow()][start.getCol()].isFigure()) {
            if (board.getBoardView(color)[start.getRow()][start.getCol()].getFigure().getColor().equals(color)) {
                System.out.println("Фигура моя");
                ver1 = true;

                if (board.getBoardView(color)[end.getRow()][end.getCol()].isFigure()) {
                    if (board.getBoardView(color)[end.getRow()][end.getCol()].getFigure().getColor().equals(color)) {
                        System.out.println("Конечное поле уже занято");
                        ver2 = false;
                    } else {
                        System.out.println("Бъем противника");
                        ver2 = true;
                        oppo = true;
                    }
                } else {
                    System.out.println("Конечное поле свободно");
                    ver2 = true;
                }
            } else {
                System.out.println("Фигура противника");
                ver1 = false;
            }
        }
        else{
            ver1 = false;
            System.out.println("Отсутствует фигура для перемещения");
        }

        if (ver1 && ver2){
            board.getBoardView(color)[end.getRow()][end.getCol()].setFigure(
                    board.getBoardView(color)[start.getRow()][start.getCol()].getFigure()
            );
            board.getBoardView(color)[start.getRow()][start.getCol()].clearField();

            if(oppo){
                if(board.getBoardView(color)[end.getRow()][end.getCol()].getFigure().getPower() == 1){
                    System.out.println("Победа!!!");
                }
                board.getBoardView(color)[end.getRow()][end.getCol()].clearField();
            }
        }

        return ver1 && ver2;
    }
}


