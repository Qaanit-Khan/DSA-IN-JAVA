public class _01_SortedOrNot {
    public static boolean Sorted_Not(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,0};
        boolean ans = Sorted_Not(arr);
        if(ans == false){
            System.out.println("Not sorted");
        }
        else{
            System.out.println("Sorted");
        }

    }
}
