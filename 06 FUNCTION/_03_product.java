import java.util.*;
public class _03_product{
    public static int product(int x, int y){
        int mul = x*y;
        return mul;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter Second number : ");
        int num2 = input.nextInt();

        int ans = product(num1,num2);
        System.out.println("The Product of "+num1+" x "+num2+" = "+ans);
    }
}