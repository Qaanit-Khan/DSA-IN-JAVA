import java.util.Scanner;
public class pass_fail{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks : ");
        int mark = input.nextInt();

        String result = mark>35 ? "Pass" : "Fail";
        System.out.println("The Student is : "+result);

    }
}