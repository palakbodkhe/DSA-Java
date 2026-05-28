import java.util.*;
public class TrappedRainwater {
    public static int TrappedRainwater(int hieght[]){

        int n = hieght.length;

        int maxLeftbound[] = new int[n];
        maxLeftbound[0]=hieght[0];
        for (int i =1; i<n; i++){
            maxLeftbound[i]=Math.max(hieght[i],maxLeftbound[i-1]);
        }
        int maxRightbound[] = new int[n];
        maxRightbound[n-1]=hieght[n-1];
        for (int i =n-2; i>=0; i--){
            maxRightbound[i] = Math.max(hieght[i],maxRightbound[i+1]);
        }

        int trappedwater = 0;
        for (int i = 0; i<n; i++){
            trappedwater += Math.min(maxLeftbound[i],maxRightbound[i]) - hieght[i];
        }

        return trappedwater;
    }

    public static void main(String[] args) {
        int height[] ={4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped water =" + TrappedRainwater(height));
    }
}
