public class _01_PassingArrayToMethod {
    public static void Change(int[] arr2){
        arr2[1] = 222;
    }
    public static void main(String[] args){
        int[] arr = {202,221,213,343};
        System.out.println(arr[1]);
        Change(arr);
        System.out.println(arr[1]);
    }
}
