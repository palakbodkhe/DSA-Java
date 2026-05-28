import java.util.*;
public class ReverseArr {

    public static void ReverseArr(int arr[]){
        int start = 0, end = arr.length-1;
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 7};
        ReverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}

