public class _08_rc {
    public static void main(String[] args) {
        int[][] arr = {{3,4,5,6},{7,8,9,0},{1,2,3,4}};

        for(int j = 0; j < arr[0].length; j++){
            if(j % 2 == 0){
                for(int i = 0; i < arr.length; i++){
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for(int i = arr.length - 1; i >= 0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        for(int[] a : arr){
            for(int e : a){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
