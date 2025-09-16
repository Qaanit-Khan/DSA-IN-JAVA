import java.util.*;
public class _02_even_odd{
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = input.nextInt();
        System.out.print("The number is even or not : "+isEven(n));
    }
}