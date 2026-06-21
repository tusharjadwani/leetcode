class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        if (a.length > b.length) {
            return findMedianSortedArrays(b, a);
        }

        int m = a.length;
        int n = b.length;
        int low = 0, high = m;

        while (low <= high) {
            int i = (low + high) / 2;
            int j = (m + n + 1) / 2 - i;

            int maxLA = (i == 0) ? Integer.MIN_VALUE : a[i - 1];
            int minRA = (i == m) ? Integer.MAX_VALUE : a[i];
            int maxLB = (j == 0) ? Integer.MIN_VALUE : b[j - 1];
            int minRB = (j == n) ? Integer.MAX_VALUE : b[j];

            if (maxLA <= minRB && maxLB <= minRA) {
                if ((m + n) % 2 != 0) {
                    return Math.max(maxLA, maxLB);
                } else {
                    return ((double) Math.max(maxLA, maxLB) + Math.min(minRA, minRB)) / 2.0;
                }
            } 
            else if (maxLA > minRB) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }
        
        return 0;
    }
}