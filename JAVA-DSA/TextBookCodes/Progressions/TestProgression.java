package Progressions;
/*
 * In this class, variable prog is polymorphic during the execution of the main method,
 *  since it references objects of class ArithmeticProgression, GeometricProgression,
 *  and Fi- bonacciProgression in turn. When the main method of the TestProgression class
 *  is invoked by the Java runtime system
 * 
 * In contrast, a geometric progression with base b = 3 will overflow a long integer
 *  after 40 iterations, as 340 > 263. Likewise, the 94th Fibonacci number is greater than 263;
 *  hence, the Fibonacci progression will overflow a long integer after 94 iterations.
 */
public class TestProgression{
    public static void main(String args[]){
        Progression prog;

        System.out.print("Arithmetic progression with default increment: ");
        prog = new ArithmeticProgression(0);
        prog.printProgression(10);

        System.out.print("Arithmetic progression with increment 5: ");
        prog = new ArithmeticProgression(5);
        prog.printProgression(10);

        System.out.print("Arithmetic progression with start 2: ");
        prog = new ArithmeticProgression(5, 2);
        prog.printProgression(10);

        // test GeometricProgression
        System.out.print("Geometric progression with default base: ");
        prog = new GeometricProgression();
        prog.printProgression(10);

        System.out.print("Geometric progression with base 3: ");
        prog = new GeometricProgression(3);
        prog.printProgression(10);

        // test FibonacciProgression
        System.out.print("Fibonacci progression with default start values: "); prog = new FibonacciProgression();
        prog.printProgression(10);
        System.out.print("Fibonacci progression with start values 4 and 6: "); prog = new FibonacciProgression(4, 6);
        prog.printProgression(8);
    }
}