import java.util.Scanner;
public class _03_MaximumInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int len = input.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the elements of arrays : ");
        for(int i = 0;i<len;i++){
            arr[i] = input.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<len;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
