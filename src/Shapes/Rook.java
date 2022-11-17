package Shapes;

public class Rook {

    public String name;

    public int row,column;

    public boolean clicked;

    public boolean timeToMove;

    public Rook(int row, int column, String name, boolean clicked, boolean timeToMove){
        this.row = row;
        this.column = column;
        this.name = name;
        this.clicked = clicked;
        this.timeToMove = timeToMove;
    }

}
