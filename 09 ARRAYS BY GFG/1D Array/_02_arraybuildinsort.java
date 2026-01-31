import java.util.Arrays;

public class _02_arraybuildinsort {

    public static void run(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,8,4,3,6,7,3,0,1};

        System.out.println("Before sorting:");
        run(arr);

        Arrays.sort(arr);

        System.out.println("After sorting:");
        run(arr);
    }
}
