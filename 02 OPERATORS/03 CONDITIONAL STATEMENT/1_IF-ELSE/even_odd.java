import java.util.Scanner;
public class even_odd{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        if(num%2 == 0){
            System.out.println("The "+num+" is "+" Even");
        }
        else{
            System.out.println("The "+num+" is "+" Odd");
        }

    }
}