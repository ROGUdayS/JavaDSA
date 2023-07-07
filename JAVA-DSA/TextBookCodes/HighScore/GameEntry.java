package HighScore;

public class GameEntry {
    private String name; // name of the person earning this score
    private int score; // the score value
    // Construct a game entry with given paraemeters
    public GameEntry(String n, int s){
        name=n;
        score=s;
    }
    // Returns the name field
    public String getName(){return name;}
    // Return the score firld
    public int getScore(){return score;}
    // Returns a string representation of this entry
    public String toString(){
        return "("+name+","+score+")";
    }
}