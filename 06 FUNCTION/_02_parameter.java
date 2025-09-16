import java.util.*;
public class _02_parameter{

    public static int CaluclateSum(int num1,int num2){
        int sum = num1+num2;
        
        return sum;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = input.nextInt();

        System.out.print("Enter Second number : ");
        int b = input.nextInt();

        int ans=CaluclateSum(a,b);
        System.out.print("The sum is : "+ans);
        

    }
}