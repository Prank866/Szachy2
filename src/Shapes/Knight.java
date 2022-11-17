package Shapes;

public class Knight {

    public String name;

    public int row,column;

    public boolean timeToMove;

    public boolean clicked;


    public Knight(int row, int column, String name, boolean clicked, boolean timeToMove){
        this.row = row;
        this.column = column;
        this.name = name;
        this.timeToMove = timeToMove;
        this.clicked = clicked;
    }
}
