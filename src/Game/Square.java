package Game;

public class Square {

    private String name;

    private int row, column;

    public String kolorPola;

    public boolean isTherePawn, isThereBlackPawn;

    public boolean białePole, czarnePole;



    public Square(int row,int column,String name, boolean isTherePawn, boolean isThereBlackPawn){
        this.row = row;
        this.column = column;
        this.name = name;
        this.isTherePawn = isTherePawn;
        this.isThereBlackPawn = isThereBlackPawn;
    }



    public void pokazNazwyPol()
    {
        System.out.print(name);
        System.out.print(kolorPola);
    }
}
