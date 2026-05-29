import java.util.*;
public class selectionSort {
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++){
            int minPos= i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[minPos]){
                   minPos = j;
                }
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void print(int arr[]){
        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr [] ={9, 8, 5, 13, 3};
        selectionSort(arr);
        print(arr);
    }
}

