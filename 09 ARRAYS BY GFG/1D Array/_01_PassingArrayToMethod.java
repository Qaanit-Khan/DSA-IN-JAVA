public class _01_PassingArrayToMethod {
    public static void Change(int[] arr2){
        arr2[1] = 222;
    }
    public static void main(String[] args){
        
        Change(arr);
        System.out.println(arr[1]);
    }
}
