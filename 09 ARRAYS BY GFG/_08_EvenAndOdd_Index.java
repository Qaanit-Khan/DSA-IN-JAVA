public class _08_EvenAndOdd_Index {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,60,70,80,90};
        System.out.print("Before : ");
        _02_arraybuildinsort.Print(arr);
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
        _02_arraybuildinsort.Print(arr);
    }
}