public class _22_MergeThreeSortedArray {
    public static void main(String[] args) {
        int[] a = {2,4,6,7,9};
        int[] b = {1,3,5,8,10,13,15};
        int[] c = {11,12,14,16,18,19,20};
        int[] d = new int[a.length + b.length + c.length];

        int i = 0, j = 0, k = 0, x = 0;

        // Merge until one array finishes
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] <= b[j] && a[i] <= c[k]) {
                d[x++] = a[i++];
            } else if (b[j] <= a[i] && b[j] <= c[k]) {
                d[x++] = b[j++];
            } else {
                d[x++] = c[k++];
            }
        }

        // Merge remaining two arrays + leftovers
        while (i < a.length && j < b.length) {
            d[x++] = (a[i] <= b[j]) ? a[i++] : b[j++];
        }
        while (j < b.length && k < c.length) {
            d[x++] = (b[j] <= c[k]) ? b[j++] : c[k++];
        }
        while (i < a.length && k < c.length) {
            d[x++] = (a[i] <= c[k]) ? a[i++] : c[k++];
        }

        // Copy any leftovers
        while (i < a.length) d[x++] = a[i++];
        while (j < b.length) d[x++] = b[j++];
        while (k < c.length) d[x++] = c[k++];

        // Print result
        for (int ele : d) {
            System.out.print(ele + " ");
        }
    }
}
