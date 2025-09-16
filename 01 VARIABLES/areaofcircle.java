import java.util.Scanner;
public class areaofcircle{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Radius of a Circle : ");
        int r = input.nextInt();
        
        double pi = 3.14;
        System.out.println("The Area of a Circle : "+(pi*(r*r)));
    }
}