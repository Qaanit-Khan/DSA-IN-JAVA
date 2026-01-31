import java.util.Arrays;

public class _10_TwoSum {
//    public static void main(String[] args) {
//        int[] arr = {4,3,2,8,0,3,5};
//        int target = 11;
//        Arrays.sort(arr);
//        int i = 0;
//        int j = arr.length-1;
//        while(i<j){
//            if(arr[i]+arr[j] == target){
//                System.out.print("The sum of "+arr[i]+" "+arr[j]);
//                break;
//            }
//            if(arr[i]+arr[j] > target){
//                j--;
//            }
//            else{
//                i++;
//            }
//        }
//    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,8,0,3,5};
        int target = 11;
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[i]+arr[j] == target){
                System.out.print(arr[i]+" "+arr[j]);
                break;
            }
            else if(arr[i]+arr[j] > target){
                j--;
            }
            else{
                i++;
            }
        }

    }
}
