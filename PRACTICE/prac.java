import java.util.*;
public class prac{
    public static void rect(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        System.out.print("Enter number of Columns : ");
        int m = input.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m; j++){
                if(i==1 || i==n || j==1 || j==m){
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
        rect();
    }
}