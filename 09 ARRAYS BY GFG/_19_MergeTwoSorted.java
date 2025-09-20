public class _19_MergeTwoSorted {
    public static void Merge(int[] c,int[] a,int[] b){
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<a.length && j<b.length){
            if(a[i] < b[j]){
                c[k++] = a[i++];
            }
            else{
                c[k++] = b[j++];
            }
        }
        while(j<b.length){
            c[k++] = b[j++];
        }
        while(i<a.length){
            c[k++] = a[i++];
        }
    }
    public static void main(String[] args) {
        int[] a = {1,3,4,6,9,10};
        int[] b = {2,5,7,8};
        int[] c = new int[a.length+b.length];
        Merge(c,a,b);
        for(int ele : c){
            System.out.print(ele+" ");
        }
    }
}
