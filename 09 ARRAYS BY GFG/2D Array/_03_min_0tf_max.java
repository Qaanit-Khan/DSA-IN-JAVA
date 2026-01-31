public class _03_min_0tf_max {
    public static void main(String arg[]){
        int[][] arr = {{3,4,5,2,7},{3,6,9,5,8},{5,6,4,0,11}};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){

            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
            if(min>max){
                min = max;
            }
        }
        System.out.println(min);
    }
}
