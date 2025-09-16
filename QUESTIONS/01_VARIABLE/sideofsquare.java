import java.util.Scanner;
public class sideofsquare{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Side of Sqare : ");
        int side = input.nextInt();
        System.out.println("The side of Square : "+(side*side));
    }
}