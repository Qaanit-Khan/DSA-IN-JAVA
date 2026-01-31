import java.util.*;
public class factorial{
    public static int factorial(int n){
        int fact = 1;
        int i = 1;
        while(i<=n){
            fact = fact * i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = input.nextInt();
        int ans = factorial(n);

        System.out.println("The factrial of "+n+" is : "+ans);

    }

}