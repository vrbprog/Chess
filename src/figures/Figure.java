package figures;

public abstract class Figure {

    Color color;

    int power;

    public Color getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract boolean checkMove(Field field);

}
