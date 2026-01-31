public class _07_Move_All_Zeroes_to_End {
        public static void Print(int[] arr){
            for(int ele : arr){
                System.out.print(ele+" ");
            }
            System.out.println("");
        }
        public static void main(String[] args) {
            int[] arr = {3,4,1,0,0,34,2,0,23,34};
            int j = 0;
            for(int i = 0;i<arr.length;i++){
                if(arr[i]!=0){
                    if(i!=j){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    j++;
                }
            }
            Print(arr);
        }
    }

