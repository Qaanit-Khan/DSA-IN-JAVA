public class _16_mergetwosortedarray {
    public static void Merge(int[] a,int[] b,int[] c){

        int i = 0,j = 0,k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++] = a[i++];
            }
            else {
                c[k++] = b[j++];
            }

        }
        while (i<a.length) {
            c[k++] = a[i++];
        }
        while (j<b.length) {
            c[k++] = b[j++];
        }
        
    }
    public static void main(String[] args) {
        int[] a = {1,6,8,9,10,13};
        int[] b = {3,4,7,8,14,16,18};
        int[] c = new int[a.length+b.length];
        Merge(a, b,c);
        for(int ele : c){
            System.out.print(ele+" ");
        }

    }
}