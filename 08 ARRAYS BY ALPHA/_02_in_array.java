import java.util.*;
public class _02_in_array{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        int marks[] = new int[50];
        System.out.print("Enter Math marks : ");
        marks[0] = input.nextInt();
        System.out.print("Enter Science Marks : ");
        marks[1] = input.nextInt();
        System.out.print("Enter Chemistry Marks : ");
        marks[2] = input.nextInt();

        System.out.println(marks[1]);

        System.out.println(marks.length);
    }
}