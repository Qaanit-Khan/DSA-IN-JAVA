import java.util.*;
public class _06_lowest{
    public static int Lowest(int numbers[]){
        int lower = Integer.MAX_VALUE;
        for(int i = 0;i<numbers.length; i++){
            if(lower>numbers[i]){
                lower = numbers[i];
            }
        }
        return lower;
    }
    public static void main(String args[]){
        int numbers[] = {22,44,353,11,4};
        System.out.println("The lowest number in the array is : "+Lowest(numbers));
    }
}