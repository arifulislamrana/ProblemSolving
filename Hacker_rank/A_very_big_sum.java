
package Hacker_rank;

import java.util.Scanner;


public class A_very_big_sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        long sum=0;
        long [] ar=new long[n];
        for(int i=0; i<n; i++){
            ar[i]=in.nextLong();
            sum += ar[i];
        }
        System.out.println(sum);
    }
}
