class Solution {
    public int minimumAddedInteger(int[] v1, int[] v2) {
       int ans = Integer.MAX_VALUE;
        int m = v2.length;
        int n = v1.length;

        Arrays.sort(v1);
        Arrays.sort(v2);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] t = new int[n];
                int index = 0;
                for (int k = 0; k < n; k++) {
                    if (k != i && k != j) {
                        t[index] = v1[k];
                        index++;
                    }
                }

                int diff = v2[m - 1] - t[m - 1];
                int f = 0;
                for (int k = m - 2; k >= 0; k--) {
                    if (v2[k] - t[k] != diff) {
                        f = 1;
                        break;
                    }
                }
                if (f == 0) {
                    ans = Math.min(ans, v2[m - 1] - t[m - 1]);
                }
            }
        }

        return ans; 
    }
}