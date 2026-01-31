import java.util.*;
public class for_loop{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int n = input.nextInt();
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact*i;
        }
        System.out.print(fact);
    }
}