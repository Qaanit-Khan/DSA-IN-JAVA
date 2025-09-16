public class _09_pairs{
    public static void Pairs(int numbers[]){
        int l = numbers.length-1;
        for(int i = 0; i <=l; i++){
            int count = numbers[i];
            for(int j = i+1; j<=l; j++){
                System.out.print("("+count+","+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        Pairs(numbers);
    }
}