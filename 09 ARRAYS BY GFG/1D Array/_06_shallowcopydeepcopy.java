public class _06_shallowcopydeepcopy {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] crr = arr;
        for(int i=0;i<crr.length;i++){
            System.out.print(crr[i]+" ");
        }
        int[] deep = arr.clone();
        for(int i=0;i<deep.length;i++){
            System.out.print(deep[i]+" ");
        }
    }
}
