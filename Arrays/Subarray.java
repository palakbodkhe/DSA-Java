import java.util.*;

public class Subarray {
    public static void Subarray(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                int sum =0;
                for(int k = i; k <= j; k++){
                    sum = sum + arr[k];
                }
                System.out.print(sum + ", ");
                if ( sum > largest){
                    largest = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum = " + largest);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        Subarray(arr);
    }

}
