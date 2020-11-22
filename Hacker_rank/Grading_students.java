
package Hacker_rank;

import java.util.Scanner;


public class Grading_students {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,temp;
        n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]>37){
                temp=(((arr[i]/5)+1)*5)-arr[i];
                if(temp<3&&temp>=0){
                    arr[i]+=temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
 
}
