public class _04_MinimumInArray {
    public static void main(String[] args){
        int[] arr = {342,32,23,221,23,21,1};
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
