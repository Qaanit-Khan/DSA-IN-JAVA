import java.util.Scanner;
public class three_no{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter A : ");
        int a = input.nextInt();

        System.out.print("Enter B : ");
        int b = input.nextInt();

        System.out.print("Enter C : ");
        int c = input.nextInt();

        if(a>b && a>c){
            System.out.println("A is Greater");
        }
        else if(b>c && b>a){
            System.out.println("B is Greater");
        }
        else{
            System.out.println("C is Greater");
        }
    }
}