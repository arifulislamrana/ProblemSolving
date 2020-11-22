
package Hacker_rank;

import static java.lang.Math.abs;
import java.util.Scanner;


public class Diagonal_difference {
    public static void main(String[] args) {
        int n,a=0,b=0,diff;
        Scanner in= new Scanner (System .in);
        n=in.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               if(i==j){
                   a+=arr[i][j];
               }
               if(i+j+1==n){
                   b+=arr[i][j];
               }
            }
        }
        diff=abs(a-b);
        System.out.println(diff);
        
        
    }
}
