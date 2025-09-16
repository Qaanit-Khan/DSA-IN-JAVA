import java.util.Arrays;
public class _02_arraybuildinsort {
    public static void main(String[] args){
        int[] arr = {2,1,3,-3,10,4,-1};
        Print(arr);
        Arrays.sort(arr);
        Print(arr);
    }
    public static void Print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
