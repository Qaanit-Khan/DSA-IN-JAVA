import java.util.Scanner;
public class incometax{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Income : ");
        int income = input.nextInt();

        int tax;

        if(income<500000){
            System.out.println("You Paid 0% tax");
        }
        else if(income>=500000 && income<1000000){
            tax = (int)(income * 0.2);
            System.out.println("You will paid 20% of tax : "+tax);
        }
        else if(income>1000000){
            tax = (int) (0.3*income);
            System.out.println("You will paid 30% tax : "+tax);
        }
        


    }
}