import java.util.*;
public class _13_BinarySearch {
    public static int BinarySearch(int[] arr,int target){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                j = mid - 1;
            }
            else if(arr[mid]<target){
                i = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {2,4,6,8,11,13,16,110,220,330};
        int target = 4000;
        System.out.println(BinarySearch(arr,target));
    }
}
