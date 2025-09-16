import java.util.*;
public class _04_lenear_f{
    public static void Print(String fruits[]){
        for(int i = 0;i<fruits.length; i++){
            System.out.println(i+1+"."+fruits[i]);
        }
    }
    public static int LenearSearch(String fruits[],String Fruit_name){
        for(int i = 0; i<fruits.length; i++){
            if(fruits[i].equals(Fruit_name)){
                return i;
            }
        }
        return -1;
    }


    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        String fruits[] = {"Apple","Mango","Banana","WaterMelon","Dragon Fruit"};

        System.out.println("Here's fruit list which is available ");
        Print(fruits);


        System.out.print("Enter Which Fruit you want : ");
        String Fruit_name = input.nextLine();

        int ans = LenearSearch(fruits,Fruit_name);

        if(ans == -1){
            System.out.print(Fruit_name + " Is Not Available Sorry");
        }
        else{
            System.out.println(Fruit_name + " Yess Availabe at index of : "+(ans+1));
        }



    }
}