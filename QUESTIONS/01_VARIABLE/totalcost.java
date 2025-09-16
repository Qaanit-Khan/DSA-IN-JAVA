import java.util.Scanner;
public class totalcost{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Cost of Pencil : ");
        float Pencil = input.nextFloat();

        System.out.print("Enter Cost of Pen : ");
        float Pen = input.nextFloat();

        System.out.print("Enter Cost of Eraser : ");
        float Eraser = input.nextFloat();

        float total = Pen+Pencil+Eraser;

        System.out.println("The Cost of Pencil : "+Pencil+"\n"+"The Cost of Pen : "+Pen+"\n"+"The Cost of Eraser : "+Eraser);
        System.out.println("The Total Cost of Pencil,Pen,Eraser :  "+(total));
        System.out.println("The Total Cost Include : 18 GST : "+(total+18.0));
    }
}