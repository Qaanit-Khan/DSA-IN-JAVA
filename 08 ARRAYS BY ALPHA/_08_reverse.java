public class _08_reverse{
    public static void Reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;
        while(first<last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = numbers[first];
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {1,3,4,5,6,7,9,10};
        Reverse(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }

    }
}