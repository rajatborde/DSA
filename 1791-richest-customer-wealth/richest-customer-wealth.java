class Solution {
    public int maximumWealth(int[][] accounts) {
        if (accounts == null || accounts.length == 0) {
            return Integer.MIN_VALUE; 
        }

        int max = Integer.MIN_VALUE;

        for (int[] customer : accounts) {
            int sum = 0;
            for (int amt : customer) {
                sum += amt;
            }
            if (max < sum) {
                max = sum;
            }
        }
        
        return max;
        
    }
}