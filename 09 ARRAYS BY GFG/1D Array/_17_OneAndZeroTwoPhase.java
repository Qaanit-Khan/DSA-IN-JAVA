public class _17_OneAndZeroTwoPhase {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,0,0,0,1};
        int ZeroCount = 0;
        for(int Ele : arr){
            if(Ele == 0) {
                ZeroCount++;
            }

        }
        for(int i = 0;i<ZeroCount;i++){
            arr[i] = 0;
        }
        for(int i = ZeroCount;i<arr.length;i++){
            arr[i] = 1;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }


}
