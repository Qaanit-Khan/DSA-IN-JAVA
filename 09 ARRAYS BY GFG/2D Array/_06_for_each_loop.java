public class _06_for_each_loop {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{4,3,2,1},{5,6,7,8},{9,1,2,3}};
        for(int a[] : arr){
            for(int k : a){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
