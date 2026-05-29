public class Array {
    public static int linSearch(String arr[], String key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String brr[] = {"abc", "bcd", "cde"};
        String element = "abc";
        int index = linSearch(brr, element);
        if (index != -1){
            System.out.println("Index of string is " + index);
        }
        else {
            System.out.println("Index not found");
        }

    }
}
