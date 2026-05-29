import java.util.*;
public class ActSelection {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int maxAct=0;
        ArrayList<Integer> list = new ArrayList<>();

        maxAct=1;
        list.add(0);
        int lastEnd=end[0];
        for (int i=0; i<end.length; i++){
            if(start[i]>=lastEnd){
                maxAct++;
                list.add(i);
                lastEnd=end[i];
            }
        }

        System.out.println("Max Activities = "+ maxAct);
        for (int i=0; i<list.size(); i++){
            System.out.println("A"+list.get(i));
        }
    }
}
