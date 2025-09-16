import java.util.Scanner;

public class _05_sumofarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of arrays : ");
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("The sum of the array is : "+sum);
    }
}
