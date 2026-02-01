public class _07_reverse {
    public static void main(String[] args) {
        int[][] arr = {{3,4,5,6},{7,8,9,0},{1,2,3,4}};
        for(int[] a : arr){
            for(int e : a){
                System.out.print(e+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i = 0;i<arr.length;i++){
            for(int j = arr[0].length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
