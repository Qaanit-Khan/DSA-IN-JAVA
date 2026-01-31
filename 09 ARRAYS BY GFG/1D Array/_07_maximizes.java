import java.util.Scanner;

public class _07_maximizes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int max = arr[0];

        System.out.print("Enter the elements of arrays : ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The maximum number in this array : "+max);
    }
}
