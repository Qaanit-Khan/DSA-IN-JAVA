import java.util.*;
public class one_n{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = input.nextInt();
        
        int i = 1;

        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
}