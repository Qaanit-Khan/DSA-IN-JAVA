public class _04_lenear{
    public static void Update(int numbers[]){
        for(int i = 0;i<numbers.length; i++){
            numbers[i] = numbers[i] = 1;
        }
    }
    public static void Print(int numbers[]){
        for(int i = 0;i<numbers.length; i++){
            System.out.print(" "+numbers[i]);
        }
        System.out.println("");
    }
    public static int LenearSearch(int numbers[],int key){
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,4,5,6,8,9,10,11};
        Print(numbers);
        // Update(numbers);
        int key = 8;
        int search = LenearSearch(numbers,key);
        if(search == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("The index of "+key+" is : "+search);
        }
    }
}