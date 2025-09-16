import java.util.*;
public class _05_binomial{
    public static int binomials(int x,int y){

        int total = 1;
        int item = 1;
        int f = 1;
        for(int i = 1; i<=x; i++){
            total = total*i;
        }
        for(int j =1; j<=y; j++){
            item = item*j;
        }
        for(int k =1; k<=(x-y); k++){
            f = f*k;
        }
        return total/(item*f);
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();
        
        System.out.print("Enter r : ");
        int r = input.nextInt();

        System.out.println("The binomial Coefficient : "+binomials(n,r));




    }
}