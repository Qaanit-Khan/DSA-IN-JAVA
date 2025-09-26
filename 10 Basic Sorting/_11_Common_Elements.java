import java.util.ArrayList;
import java.util.Arrays;

public class _11_Common_Elements {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] a = {3,4,2,3,5,9,7,6,4,11,4};
        int[] b = {2,3,2,5,12,3,4,7,9,10,12};
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0,j = 0;
        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
        }
        System.out.print(ans);

    }
}
