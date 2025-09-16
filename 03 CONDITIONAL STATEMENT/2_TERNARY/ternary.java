import java.util.Scanner;
public class ternary{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int a = input.nextInt();

        String var = a%2==0 ? "Even" : "Odd";
        System.out.println(var);
    }
}