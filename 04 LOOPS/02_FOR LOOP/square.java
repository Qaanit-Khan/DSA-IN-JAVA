import java.util.*;
public class square{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = input.nextInt();

        for(int i = 1; i<=n; i++){ // 1 to 5 --> go 1 | 2 |
            for(int k = 1;k<=n; k++){ // 1 to 5 start printing( ***** over then ******
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}