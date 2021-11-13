package figures;

import figures.Figure;

public class Field {

    Figure figure;
    boolean hasFigure;

    public Field() {
        this.hasFigure = false;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
        hasFigure = true;
    }

    public void clearField() {
        figure = null;
        hasFigure = false;
    }

    public boolean isFigure() {
        return hasFigure;
    }

}
