import java.util.*;
public class _01_rectangle{
    public static void Hallow_rectangle(int rows,int col){
        for(int i = 1;i<=rows; i++){
            for(int j = 1;j<=col;j++){
                if(i==rows || j==col || i==1 || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Hallow_rectangle(5,5);
    }
}