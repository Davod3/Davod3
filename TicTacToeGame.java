/**
 * The class {@code TicTacToeGame} defines a type whose objects represent
 * the state of a game of tictactoe with players 1 and 2.
 * The the first player is 1 and he plays with Piece.X.
 *
 * @author IP1920
 */
public class TicTacToeGame{
    private final int DIM = 3;
    private Board game;
    private boolean isOver;
    private int currentPlayer;
    private Piece currentPiece;


    /**
     * Creates a tictactoe game in the initial state.
     */
    public TicTacToeGame(){
         this.game = new Board(DIM);
         this.isOver = false;
         this.currentPlayer = 0;
         this.currentPiece = Piece.X;

    }

    /**
     * Checks if the game is over, i.e., if one row, column or diagonal is filled
     * with the same piece or if the board is full
     *
     * @return      if the game is over
     */
    public boolean isOver(){
      return this.isOver;
    }

    /**
     * The next player to play
     *
     * @return      The next player to play
     * @requires    {@code !isOver()}
     * @ensures     {@code 1 ≤ \result ≤ 2}
     */
    public int getPlayer(){
      if (this.currentPlayer == 0) {
        this.currentPlayer = 1;
        //only happens when new game
      }
      else if(this.currentPlayer == 1) {
        this.currentPlayer = 2;
        this.currentPiece = Piece.O;
      }
      else if (this.currentPlayer = 2) {
        this.currentPlayer = 1;
        this.currentPiece = Piece.X;
      }
      return this.currentPlayer;
    }

    /**
     * Checks if the given integers define a valid move
     * @param row   the row number
     * @param col   the column number
     * @return      if the given integers define a valid move
     */
    public boolean isValid(int row, int col){
        boolean isValid = false;
        if((row<DIM) && (col<DIM) && (row>=1) && (col>=1)){
          isValid = true;
        }
        return isValid;
    }

    /**
    * Gets a copy of the board in the current state
    *
    * @return an independent copy of the board
    * @ensures {@code \result != null}
    */
    public Board getBoard(){
        return new Board(DIM);
    }

    /**
     * Plays the symbol associated to getPlayer() in the square indentified
     * by the row and col
     *
     * @param row   the row number
     * @param col   the column number
     * @requires    {@code isValid(row,col) && !isOver()}
     */
    public void play(int row, int col){
        int player = getPlayer();
        //HERE
    }

    /**
     * Gets a textual representation of the state of the game
     *
     * @return  A textual representation of the state of the game
     */
    public String toString(){
        //TODO
    }
}
