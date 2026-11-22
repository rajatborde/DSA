class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        return sumK(nums, k) - sumK(nums, k-1);
    }
    public static int sumK(int[] nums, int k){
            int l=0, sum=0, count=0;
            if(k<0) return 0;

            for(int r=0; r< nums.length; r++){
                sum+=nums[r];
                while(sum>k){
                    sum-=nums[l];
                    l++;
                }
                count+=r-l+1;
            }
            return count;
        }
}
