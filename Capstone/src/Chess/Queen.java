package Chess;

public class Queen extends ChessPiece{
    public Queen(ChessBoard chessBoard, int positionX, int positionY, String color, String type, char uchar) {
        super(chessBoard,positionX, positionY, color, "Queen", uchar );
    }
    public boolean isMovementLegal(int newX, int newY){
        boolean success = (Movement.isLegalHorizontalMovement(this.chessBoard, this.getPositionX(), this.getPositionY(), newX, newY, 0) ||
                Movement.isLegalVerticalMovement(this.chessBoard, this.getPositionX(), this.getPositionY(), newX, newY, 8) ||
                Movement.isLegalDiagonalMovement(this.chessBoard, this.getPositionX(), this.getPositionY(), newX, newY, 8));

        return  success;
    };
}
