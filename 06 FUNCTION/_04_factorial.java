import java.util.*;
public class _04_factorial{
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = input.nextInt();

        int ans =  factorial(n); 

        System.out.print(ans);  
        
    }
}