package boardgame;

public class Board {
 private int rows;
 private int columns;
 private Piece[][] pieces;

    public Board(int columns, int rows) {
        if(rows < 1 || columns <1){
            System.out.println("Error creating a new board.");
           // throw new BoardException("Error creating a new board.");
        }
        this.columns = columns;
        this.rows = rows;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }

    public Piece piece(int row, int column){
        if(!positionExist(row, column)){
            //throw new Exception("Position not valid.");
            System.out.println("Position not valid.");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position){
        if(!positionExist(position)){
            //throw new Exception("Position not valid.");
            System.out.println("Position not valid.");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
            if(thereIsAPiece(position)){
                    System.out.println("There is alredy a piece on position " + position);
            }else{
            pieces[position.getRow()][position.getColumn()] = piece;
            piece.position = position;}
    }

    private boolean positionExist(int row, int column){
        
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }
    public boolean positionExist(Position position){

        return positionExist(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        if(!positionExist(position)){
            System.out.println("Position not valid.");
        }
        return piece(position) != null;
    }

   
}
