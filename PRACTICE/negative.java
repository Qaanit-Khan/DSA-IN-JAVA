import java.util.*;
public class negative{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int arr[] = new int[7];
        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < 1){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("");
        for(int i = 0; i<arr.length; i++){
            System.out.print(2*arr[i]+" ");
        }
    }
}