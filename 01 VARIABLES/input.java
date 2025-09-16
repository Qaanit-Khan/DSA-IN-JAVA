import java.util.Scanner;
public class input{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        int a = input.nextInt();

        System.out.print("Enter second Number : ");
        long b = input.nextInt();

        System.out.print("THE SUM OF "+a+" & "+b+" : "+a+b);
    }
}