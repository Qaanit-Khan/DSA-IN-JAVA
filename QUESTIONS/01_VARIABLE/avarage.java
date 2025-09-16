import java.util.Scanner;
public class avarage{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A : ");
        float a = input.nextFloat();
        System.out.print("Enter B : ");
        float b = input.nextFloat();
        System.out.print("Enter C : ");
        float c = input.nextFloat();
        System.out.println("THE AVARAGE OF "+a+" , "+b+" , "+c+" : "+((a+b+c)/3));

    }
}