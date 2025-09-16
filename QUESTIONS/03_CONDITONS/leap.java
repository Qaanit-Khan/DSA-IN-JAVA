import java.util.Scanner;
public class leap{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a year : ");
        int year = input.nextInt();

        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("the year is leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
}