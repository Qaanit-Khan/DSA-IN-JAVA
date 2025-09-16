import java.util.*;
public class _05_largest{
    public static int Largest(int numbers[]){
        int larger = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            if(larger<numbers[i]){
                larger = numbers[i];
            }
        }
        return larger;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,334,4343,2342,342,2343,34342,3434,23333};
        int ans = Largest(numbers);
        System.out.println("The largest number is : "+ans);
    }
}