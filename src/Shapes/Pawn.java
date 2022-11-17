package Shapes;

public class Pawn {
    public String name;

    public int row,column;

    public boolean timeToMove;

    public boolean clicked;

    public Pawn(int row, int column, String name, boolean clicked, boolean timeToMove){
        this.row = row;
        this.column = column;
        this.name = name;
        this.timeToMove = timeToMove;
        this.clicked = clicked;
    }

}
