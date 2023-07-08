package HighScore;

public class Scoreboard {
    private int numEntries=0; // number of actual entries
    private GameEntry[] board; // Array of game entries(name and score)
    // Construct an empty scoreboard with the given capacity for storing entries
    public Scoreboard(int capacity){
        board=new GameEntry[capacity];
    }

    /* Adding an Entry */
    public void add(GameEntry e){
        int newScore=e.getScore();
        // check if the new wntry is a high score
        if(numEntries<board.length||newScore>board[numEntries-1].getScore()){
            if(numEntries<board.length){numEntries++;} // no score drops overall numbers increase
            // shift any lower scores rightward to make room for the new entry
            int j=numEntries-1;
            while(j>0 && board[j-1].getScore()<newScore){
                board[j]=board[j-1];
                j--;
            }
            board[j]=e;
        }
    }

    // Remove and return the high score at index
    public GameEntry remove(int i) throws IndexOutOfBoundsException{
        if(i<0||i>=numEntries){
            throw new IndexOutOfBoundsException("Invalid index : "+i);
        }
        GameEntry temp=board[i];
        for(int j=i;j<numEntries-1;j++){
            board[j]=board[j+1];
        }
        board[numEntries-1]=null;
        numEntries--;
        return temp;
    }
}