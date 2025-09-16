import java.util.*;
public class _04_factorial{
    public static int Factorial(int x){
        int num = 1;
        for(int i = 1;i<=x;i++){
            num = num*i;
        }
        return num;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        System.out.print("Enter a number : ");
        int m = input.nextInt();

        int ans = Factorial(n);

        int ans2 = Factorial(m);
        System.out.println("The Factorial of "+n+" is : "+ans);
        System.out.println("The Factorial of "+n+" is : "+ans2);
    }
}