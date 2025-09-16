import java.util.*;
public class _6_butterfly{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("The size of butterfly : ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int k = 1; k<=(2*(n-i)); k++){
                System.out.print("  ");
            }
            for(int l = 1; l<=i; l++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i = 1; i <= n; i++){
            for(int j = 0; j<=n-i; j++){
                System.out.print("* ");
            }
            for(int k = 3; k<=(2*i); k++){
                System.out.print("  ");
            }
            for(int j = 0; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}