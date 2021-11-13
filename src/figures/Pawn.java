package figures;

public class Pawn extends Figure{

    public Pawn(Color color) {
        this.color = color;
        power = 2;
    }

    @Override
    public boolean checkMove(Field field) {
        return false;
    }
}
