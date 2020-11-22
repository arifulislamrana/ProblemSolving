
package Hacker_rank;

import java.util.Scanner;

public class compare_the_triplates {
    public static void main(String[] args) {
        int allice=0,bob=0;
        
        Scanner in=new Scanner(System.in);
        
        int[] a=new int[3];
        int[] b=new int[3];
        
        for(int i=0; i<3; i++){
            a[i]=in.nextInt();
        }
        for(int i=0; i<3; i++){
            b[i]=in.nextInt();
        }
        for(int i=0; i<3; i++){
            if(a[i]>b[i]){
                allice++;
            }
            if(a[i]<b[i]){
                bob++;
            }
        }
        System.out.printf("%d %d\n",allice,bob);
        
        
        
    }
}
