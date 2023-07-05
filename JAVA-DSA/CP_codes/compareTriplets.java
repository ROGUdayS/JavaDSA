// The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).
// The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
// If a[i] > b[i], then Alice is awarded 1 point.
// If a[i] < b[i], then Bob is awarded 1 point.
// If a[i] = b[i], then neither person receives a point.
// Comparison points is the total points a person earned.
// Given a and b, determine their respective comparison points.
// Example
// a = [1, 2, 3] 
// b = [3, 2, 1] 
// For elements *0*, Bob is awarded a point because a[0] .
// For the equal elements a[1] and b[1], no points are earned.
// Finally, for elements 2, a[2] > b[2] so Alice receives a point.
// The return array is [1, 1] with Alice's score first and Bob's second.
// Function Description
// Complete the function compareTriplets in the editor below.
// compareTriplets has the following parameter(s):
// int a[3]: Alice's challenge rating
// int b[3]: Bob's challenge rating
// Return
// int[2]: Alice's score is in the first position, and Bob's score is in the second.
// Input Format
// The first line contains 3 space-separated integers, a[0], a[1], and a[2], the respective values in triplet a. 
// The second line contains 3 space-separated integers, b[0], b[1], and b[2], the respective values in triplet b.
// Constraints
// 1 ≤ a[i] ≤ 100
// 1 ≤ b[i] ≤ 100
import java.util.Scanner;
public class compareTriplets{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a[] =new int[3];
        int b[] =new int[3];
        scan.close();
        int a_score=0;
        int b_score=0;
        for(int i=0;i<3;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<3;i++){
            b[i]=scan.nextInt();
        }
        for(int i=0;i<3;i++){
            if(a[i]>b[i]){
                a_score++;
            }
            else if(a[i]<b[i]){
                b_score++;
            }
        }
        System.out.println(a_score+" "+b_score);
    }
}
