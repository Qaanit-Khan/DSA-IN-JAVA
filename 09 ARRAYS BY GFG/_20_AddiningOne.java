import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class _20_AddiningOne {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,0};
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]==0 && arr[j]==1){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
