import java.util.*;
public class if_ten_break{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter : ");
            int n = input.nextInt();
            if(n%10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
        
    }
}