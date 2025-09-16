import java.util.*;
public class _11_maxsubarray{
    public static void MaxArray(int numbers[]){
        int currSum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                currSum = 0;
                for(int k = i; k <= j; k++){
                    currSum = currSum + numbers[k];
                }
                System.out.println(currSum);
                if(max < currSum){
                    max = currSum;
                }
            }
        }
        System.out.println("The max sum : "+max);

    }
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        MaxArray(numbers);
    }
}