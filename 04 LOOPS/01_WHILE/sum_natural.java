import java.util.*;
public class sum_natural{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = input.nextInt();
        int i = 1;
        int natural = 0;
        while(i<=n){
            natural = natural+i;
            i++;
        }
        System.out.print("The sum of natural numer unitl : "+n+" : "+(natural));
    }
}