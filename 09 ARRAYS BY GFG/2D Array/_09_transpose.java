public class _09_transpose {
    public static void print(int[][] arr){
        for(int a[] : arr){
            for(int k : a){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{4,3,2,1},{5,6,7,8},{9,1,2,3}};
        print(arr);
        int row = arr.length;
        int col = arr[0].length;
        int[][] ans = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                ans[i][j] = arr[j][i];
            }
        }
        print(ans);
    }
}
