
import java.util.Scanner;

public class _06_a_raised_b {
    public static int Pow(int a,int b){
        if(b == 0) return 1;
        int call = Pow(a,b/2);
        if(b%2 == 0) return call*call;
        else return a*call*call;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Base : ");
        int a = input.nextInt();
        
        System.out.print("Enter Exponent : ");
        int b = input.nextInt();

        System.out.println(a+" Raised to the Power "+b+" is "+Pow(a, b));
        
    }
}
