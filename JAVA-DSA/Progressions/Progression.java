package Progressions;
// Generates a simple Progression
public class Progression {
    //instance variable 
    protected long current;
    
    //Constructs a progression starting at zero
    public Progression(){this(0);}

    //Construct a progression with given start value
    public Progression(long start){current=start;}

    //Returns the next value of the progression
    public long nextValue(){
        long answer=current;
        advance();/* This protected call is responsible for advancing the current value */ 
        return answer;
    }
    
    /*Advances the current value to the next value of the progression*/
    protected void advance(){
        current++;
    }

    /*Prints the next n values of the progression, separated by spaces */
    public void printProgression(int n){
        System.out.print(nextValue());
        for(int j=1;j<n;j++){
            System.out.print(" "+nextValue());
        }
        System.out.println();
    }

}