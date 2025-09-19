import java.util.*;
public class even{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = input.nextInt();

        String Result = n%2==0 ? "Even" : "Odd";
        System.out.print(Result);
    }
}