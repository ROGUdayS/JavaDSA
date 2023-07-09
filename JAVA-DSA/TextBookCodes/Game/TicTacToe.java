package Game;

public class TicTacToe {
    public static final int X=1,O=-1; // players
    public static final int EMPTY=0; // empty cell
    private int board[][]=new int[3][3]; // game board
    private int player; // current player

    /* New game clears the board */
    public void clearBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=EMPTY;
            }
        }
        player=X;
    }

    /* Constructor */
    public TicTacToe(){clearBoard();}

    public void putMark(int i, int j) throws IllegalArgumentException{
        if((i<0)||(i>2)||(j<0)||(j>2)){
            throw new IllegalArgumentException("Invalid board position");
        }
        if(board[i][j]!=EMPTY){
            throw new IllegalArgumentException("Board position occupied");
        }
        board[i][j]=player; // place the mark for the current player
        player=-player;
    }

    /* Check whether the board configuration is a win for the given player */
    public boolean isWin(int mark){
        return((board[0][0]+board[0][1]+board[0][2]==mark*3)
            ||(board[1][0]+board[1][1]+board[1][2]==mark*3)
            ||(board[2][0]+board[2][1]+board[2][2]==mark*3)
            ||(board[0][0]+board[1][0]+board[2][0]==mark*3)
            ||(board[0][1]+board[1][1]+board[2][1]==mark*3)
            ||(board[0][2]+board[1][2]+board[2][2]==mark*3)
            ||(board[0][0]+board[1][1]+board[2][2]==mark*3)
            ||(board[0][2]+board[1][1]+board[2][0]==mark*3)
        );
    }

    /* Returns the winning player's code, or 0 to indicate a tie (or unfinished game) */
    public int winner(){
        if(isWin(X))
            return(X);
        else if(isWin(0))
            return(O);
        else
            return(0);
    }

    /* Test run of a simple game */
    public static void main(String args[]){
        TicTacToe game=new TicTacToe();
           /* X Moves */            /* O moves */
        game.putMark(1,1);  game.putMark(0,2);
        game.putMark(2,2);  game.putMark(0,0);
        game.putMark(0,1);  game.putMark(2,1);
        game.putMark(1,2);  game.putMark(1,0);
        game.putMark(2,0);
        System.out.println(game);
        int winningPlayer=game.winner();
        String outcome[]={"O wins","Tie","X wins"};
        System.out.println(outcome[1+winningPlayer]);
    }
}