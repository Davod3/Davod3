/**
 * The class {@code Board} defines a type whose objects represent
 * the state of a square board with a given dimension. The cells
 * of the board can be empty or filled with a piece.
 *
 * @author  IP1920
 */


public class Board{

  private int dimension;
  private Piece[][] board;


  /**
  * @requires {@code dimension>0}
  */
  public Board(int dimension){
	   this.dimension = dimension;
     this.board = new Piece[dimension][dimension];
  }

  /**
  * @requires {@code 1<=row && col<=dim()}
  */
  public void fill(int row, int col, Piece piece){
    this.board[row-1][col-1] = piece;
  }

  /**
   * @requires {@code 1<=row && col<=dim()}
   * @ensures {@code isFilled(row,col)=> \result!=null}
   */
  public Piece getPiece(int row, int col) {
      return this.board[row][col];
  }

  /**
   * The dimension of the board
   *
   * @return The dimension of the board
   * @ensures {@code \result > 0 }
   */
  public int dim() {
      return this.dimension;
  }

  /**
  * Checks if the cell is filled
  *
  * @return whether the cell is filled
  * @requires {@code 1<= row,col <= dim()}
  */
  public boolean isFilled(int row, int col){
      boolean isFilled = (this.board[row-1][col-1] != null);
      return isFilled;
  }

  /**
  * Checks if the board is full, i.e., every
  * cell is filled with a piece
  *
  * @return whether the board is full
  */
  public boolean isFull() {
      boolean isFull = true;
      for (int i = 0;i<this.dimension ;i++ ) {
        for (int j = 0;j<this.dimension ;j++ ) {
          if (this.board[i][j] == null) {
            isFull = false;
          }
        }
      }
      return isFull;
  }

  /**
  * Copies the board
  *
  * @return an independent copy of the board
  */
  public Board copy(){
      return new Board(this.dimension);
  }

  /**
  * TODO Adicionar documentac
  */
  public String toString(){
     StringBuilder finalString = new StringBuilder();
     for (int i = 0;i<this.dimension ;i++ ) {
	     finalString.append(toStringRow(this.board[i]));
	   }

     return finalString.toString();
  }

  /**
  * Returns a textual representation of an array of pieces
  * Null elements are represented with white spaces
  *
  * @param pieces 	the array with the pieces
  * @return 			a textual representation of the pieces in the array
  */
  private static String toStringRow(Piece[] pieces) {
	  StringBuilder sb = new StringBuilder("| ");
	  for (int i = 0; i < pieces.length; i++)
		   sb.append(pieces[i]==null? " ": pieces[i]);
	  sb.append(" | \n");
	  return sb.toString();
  }
}
