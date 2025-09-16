import java.util.*;
public class inverted{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = input.nextInt();

        for(int line = 0; line<n; line++){
            for(int star = 0; star<n-line; star++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}