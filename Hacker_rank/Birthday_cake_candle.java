
package Hacker_rank;

import java.util.Scanner;

public class Birthday_cake_candle {
     public static void main(String[] args) 
        {
            int temp,n,maxcandle=0;
            Scanner s = new Scanner(System.in);
            n=s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i <n; i++){
                    arr[i] = s.nextInt();
                }
            int largest=arr[0];
            for (int i = 0; i < n; i++){
                if (largest < arr[i])
			largest = arr[i];
            }
            for(int i=n-1; i>=0; i--){
                if(largest==arr[i]){
                    maxcandle++;
                }
            }
            System.out.println(maxcandle);
        }
}
