import java.util.*;
public class _05_binomials{
    public static int Factorial(int x){
        int num = 1;
        for(int i = 1;i<=x;i++){
            num = num*i;
        }
        return num;
    }
    public static int binomial_cofficient(int x,int y){
        int n_factorial = Factorial(x);
        int r_factorial = Factorial(y);
        int nmr_factorial = Factorial(x-y);
        int binomial = n_factorial/(r_factorial*nmr_factorial);
        return binomial;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n number : ");
        int n = input.nextInt();

        System.out.print("Enter r number : ");
        int r = input.nextInt();

        System.out.print("The Binomial Cofficient : "+binomial_cofficient(n,r));
    }
}