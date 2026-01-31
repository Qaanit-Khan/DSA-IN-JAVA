import java.util.Scanner;
public class inverted{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}