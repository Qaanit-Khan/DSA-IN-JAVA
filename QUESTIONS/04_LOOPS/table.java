import java.util.*;
public class table{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of table : ");
        int n = input.nextInt();

        for(int i = 1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        
    }
}