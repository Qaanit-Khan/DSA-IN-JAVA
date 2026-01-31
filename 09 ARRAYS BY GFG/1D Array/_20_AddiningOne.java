import java.util.*;

public class _20_AddiningOne {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = {1,9,9};
        int carry = 1;

        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] + carry <= 9){
                ans.add(carry + arr[i]);
                carry = 0;
            } else {
                ans.add(0);
                carry = 1;
            }
        }

        // ✅ carry check should be outside the loop
        if(carry == 1){
            ans.add(1);
        }

        Collections.reverse(ans);
        for(int ele : ans){
            System.out.print(ele);
        }
    }
}
