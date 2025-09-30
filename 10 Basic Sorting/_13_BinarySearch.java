import java.util.*;
public class _13_BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {2,4,6,8,11,13,16,110,220,330};
        for(int ele : arr){
            System.out.print(ele+" ");
        }

        System.out.print("\nEnter target : ");
        int target = input.nextInt();

        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == target){
                System.out.print(mid);
                break;
            }
            else if(arr[mid]<target){
                i = mid + 1;
            }
            else if(arr[mid]>target){
                j = mid - 1;
            }
        }
    }
}
