
package Hacker_rank;

import java.util.Scanner;

public class Mini_max_sum {
    public static void main(String[] args) 
        {
            int temp,minisum=0,maxsum=0;
            Scanner s = new Scanner(System.in);
            int arr[] = new int[5];
            for (int i = 0; i <5; i++){
                    arr[i] = s.nextInt();
                }
            for (int i = 0; i < 5; i++){
                for (int j = i + 1; j < 5; j++){
                    if (arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            for (int i = 0; i < 4; i++){
                minisum=minisum+ arr[i];
            }
            for (int i = 4; i >0; i--){
                maxsum=maxsum+ arr[i];
            }
            System.out.printf("%d %d\n",minisum,maxsum);
        }
}
