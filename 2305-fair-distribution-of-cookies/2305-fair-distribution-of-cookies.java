class Solution {
    int minimumUnfairValue = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        // we have total k children
        int[] childrenDistributionList = new int[k];

        // try all possible combinations, using recursion
        helper(0, childrenDistributionList, cookies);

        return minimumUnfairValue;
    }

    public void helper(int ind, int[] childrenDistributionList, int[] cookies) {
        if(ind == cookies.length) {
            // no more cookies are left
            findMinimumUnFairValue(childrenDistributionList);
            return;
        }

        int currentCookie = cookies[ind];
        // now try to distribute currentCookie to all k childrens
        for(int i = 0; i < childrenDistributionList.length; i++) {
            childrenDistributionList[i] += currentCookie;
            helper(ind+1, childrenDistributionList, cookies);
            // do backtracking
            childrenDistributionList[i] -= currentCookie;

            if(childrenDistributionList[i] == 0) break;
        }
    }

    public void findMinimumUnFairValue(int[] arr) {
        int maxValueFromArray = Integer.MIN_VALUE;
        for(int item : arr) {
            maxValueFromArray = Math.max(maxValueFromArray, item);
        }
        minimumUnfairValue = Math.min(minimumUnfairValue, maxValueFromArray);
    }
}