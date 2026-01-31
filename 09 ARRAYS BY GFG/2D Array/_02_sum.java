public class _02_sum {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{5,4,5,8,9},{2,5,6,7,9}};
        int max = Integer.MIN_VALUE;
        int row = -1;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<arr[0].length;j++){
                sum += arr[i][j];
            }
            if(sum>max){
                max = sum;
                row = i;
            }
        }
        System.out.println(max+" "+row);
    }
}