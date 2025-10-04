import java.util.Scanner;
public class calculator{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number  : ");
        int a = input.nextInt();

        System.out.print("Enter Symbol : ");
        String Symbol = input.next();

        System.out.print("Enter Second number : ");
        int b = input.nextInt();

        switch(Symbol){
            case "+" : System.out.print(a +" + "+ b +" = "+(a+b));
            break;
            case "-" : System.out.print(a +" - "+ b +" = "+(a-b));
            break;
            case "*" : System.out.print(a +" * "+ b +" = "+(a*b));
            break;
            case "/" : System.out.print(a +" / "+ b +" = "+(a/b));
            break;
            case "%" : System.out.print(a +" % "+ b +" = "+(a%b));
            break;
            default  : System.out.println("Something Wrong");
        }

    }
}