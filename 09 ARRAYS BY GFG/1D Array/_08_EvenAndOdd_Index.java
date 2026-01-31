public class _08_EvenAndOdd_Index {
    public static void print(int[] arr){
        int n = arr.length;
        for (int i = 0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,60,70,80,90};
        System.out.print("Before : ");
        print(arr);
        for(int i=0;i<arr.length;i++){
            if(i%2 == 0){
                arr[i] *= 2;
            }
            else{
                arr[i] += 10;
            }
        }
        System.out.println("");
        System.out.print("After : ");
        _02_arraybuildinsort.run(arr);
    }
}