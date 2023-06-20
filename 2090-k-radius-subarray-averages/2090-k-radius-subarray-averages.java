class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avrg = new int[n];
        Arrays.fill(avrg, -1);
        int h = 2 * k + 1;
        double sum = 0;
        if (n < 2 * k + 1) {
            return avrg; 
        }
        for (int i = 0; i < h; i++) {
            sum += nums[i];
        }
        double avg = sum / h;
        avrg[k] = (int) avg;
        for (int i = k + 1; i < n - k; i++) {
            sum -= nums[i - k - 1];
            sum += nums[i + k];
            double l = sum / h;
            avrg[i] = (int) l;
        }
        return avrg;
    }
}
