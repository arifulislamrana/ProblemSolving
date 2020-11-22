
package Hacker_rank;

import java.util.Scanner;

/**
 *
 * @author Ariful Islam
 */
public class ElectronicsShop {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int budget = input.nextInt();
        int kblength = input.nextInt();
        int dvlength = input.nextInt(); 
        int[] keyboards = new int[kblength];
        int[] drives = new int[dvlength];
        
        for (int i = 0; i < kblength; i++) {
            keyboards[i] = input.nextInt();
        }
        
        for (int i = 0; i < dvlength; i++) {
            drives[i] = input.nextInt();
        }
        int max = -1;
        for (int i = 0; i < kblength; i++) {
            for (int j = 0; j < dvlength; j++) {
                if ((keyboards[i]+drives[j] <= budget) && (keyboards[i]+drives[j] > max)) {
                    max = keyboards[i]+drives[j];
                }
            }
        }
        
        System.out.println(max);
    }
}
