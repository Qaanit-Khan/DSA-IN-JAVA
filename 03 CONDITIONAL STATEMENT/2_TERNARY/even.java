import java.util.*;
public class even{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a marks : ");
        int marks = input.nextInt();

        int result = marks>35 ? 1 : -1;
        if(result == 1){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}