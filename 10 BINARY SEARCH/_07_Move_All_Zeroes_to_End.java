public class _07_Move_All_Zeroes_to_End {
        public static void print(int[] arr){
            for(int ele : arr){
                System.out.print(ele+" ");
            }
            System.out.println("");
        }
        public static void main(String[] args) {
            int[] arr = {9,0,-4,0,5,0,0,3,7,1,2};
            int n = arr.length;
            for(int i = 0;i<n-1;i++){
                for(int j = 0;j<n-1-i;j++){
                    if(arr[j] == 0){
                        int temp =  arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            print(arr);
        }
    }

