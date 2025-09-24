import java.util.Scanner;

public class _03_MaximumInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        System.out.print("Enter the elements of arrays : ");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The sum of the array is : "+sum);
        System.out.println("The maximum number in this array : "+max);
    }
}
