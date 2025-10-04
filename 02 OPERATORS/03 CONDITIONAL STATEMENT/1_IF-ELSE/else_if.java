import java.util.Scanner;
public class else_if{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age : ");
        int age = input.nextInt();

        if(age>1 && age<=10){
            System.out.println("Children");
        }
        else if(age>10 && age<=17){
            System.out.println("Teeneger");
        }
        else if(age>17 && age<=25){
            System.out.println("Adult");
        }
        else{
            System.out.println("older and adult");
        }

    }
}
