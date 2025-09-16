import java.util.*;
public class factorial{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = input.nextInt();

        int fact = 1;
        int i = 1;
        while(i<=n){
            fact = fact*i;
            i++;
        }
        System.out.println("The factorial of "+n+" is : "+fact);
    }
}