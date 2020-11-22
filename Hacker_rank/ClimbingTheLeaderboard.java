
package Hacker_rank;

import java.util.Scanner;
import static java.util.stream.IntStream.of;


public class ClimbingTheLeaderboard {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int l = input.nextInt();
        int[] leaderboard = new int[l];
        for (int i = 0; i < l; i++) {
            leaderboard[i] = input.nextInt();
        }
        
        int n = input.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = input.nextInt();
        }
        
        int[] arr = of(leaderboard).distinct().toArray();
        /*
        for (int i = 0; i < scores.length; i++) {
            int j;
            for (j = arr.length-1; j >= 0 ; j--) {
                if (scores[i]<arr[j]) {
                    System.out.println(j+2);
                    break;
                }
            }
            if (j<0) {
                System.out.println(1);
            }
        }
        */
        
        int i = arr.length-1;
        for(int score: scores) {
            while(i>=0) {
                if(score>=arr[i]) i--;
                else {System.out.println(i+2); break;}
            }
            if(i<0) System.out.println(1);
        }
    }
}
