import java.util.*;
public class reverse_num{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = input.nextInt();

        System.out.print("The reverse number : ");
        while(n>0){
            int last_digit = n%10;
            System.out.print(""+last_digit);
            n = n/10;
        }
    }
}