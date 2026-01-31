public class _21_MergeArrayBackside {
    public static void main(String[] args) {
        int[] a = {2,4,6,8};
        int[] b = {1,3,5,7,9,10};
        int[] c = new int[a.length+b.length];
        int i = a.length-1;
        int j = b.length-1;
        int k = c.length-1;

        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                c[k--] = a[i--];
            }
            else{
                c[k--] = b[j--];
            }
        }
        while (i>=0){
            c[k--] = a[i--];
        }
        while(j>=0){
            c[k--] = b[j--];
        }
        for(int ele : c){
            System.out.print(ele+" ");
        }
    }
}
