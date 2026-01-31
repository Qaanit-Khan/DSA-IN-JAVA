public class _04_MinimumInArray {
    public static void main(String[] args){
        int[] arr = {342,32,23,221,23,21,1};
        int min = arr[0]; // 342 gaya andar min mei
        for(int i=0; i<arr.length;i++){
            if(min > arr[i]){ //342 kya bada hai 32 haan min now 32, 32 kya bada hai 23 se haan 23 andar gaya fir 221 nahi ingonre , fir 23 bada hai 21 se haan ignore 
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
