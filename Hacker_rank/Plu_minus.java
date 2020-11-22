
package Hacker_rank;

import java.util.Scanner;

public class Plu_minus {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int[] arr= new int[n];
        int a=0,b=0,c=0;
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
            if(arr[i]<0){
                b++;
            }
            if(arr[i]>0){
                a++;
            }
            if(arr[i]==0){
                c++;
            }
        }
        double pos,neg,eql;
        pos=a/(double)n;
        neg=b/(double)n;
        eql=c/(double)n;
        System.out.printf("%.6f \n%.6f \n%.6f\n",pos,neg,eql);
    }
    
}
