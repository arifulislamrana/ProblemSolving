
package Hacker_rank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ariful Islam
 */
public class TheHurdleRace {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int jump = input.nextInt();
        int[] obstcl = new int[n];
        
        for (int i = 0; i < n; i++) {
            obstcl[i] = input.nextInt();
        }
        
        Arrays.sort(obstcl);
        int temp = obstcl[obstcl.length-1];
        if (jump > temp) {
            System.out.println(0);
        } else {
            System.out.println(temp-jump);
        }
    }
}
