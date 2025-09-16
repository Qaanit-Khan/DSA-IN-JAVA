import java.util.*;
public class read_sum{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        
        
        int even = 0;
        int odd = 0;
        for(int i = 1;i<=10; i++){
            System.out.print("Enter number : ");
            int n = input.nextInt();
            if(n%2==0){
                even = even + n;
            }
            else{
                odd = odd + n;
            }
            
        }
        System.out.println("The sum of even number is : "+even);
        System.out.println("The sum of odd  number is : "+odd);


    }
}