public class _04_print_colum {
    public static void main(String[] args) {
        int[][] arr = {{3,3,4,5},{3,5,6,3},{7,9,0,1}};
        for(int j = 0;j<arr[0].length;j++){
            for(int i = 0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
