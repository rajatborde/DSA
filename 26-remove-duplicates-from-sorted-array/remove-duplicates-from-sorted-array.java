class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;

        for(i=1; i<nums.length; i++){
            if(nums[j-1]==nums[i])
                continue;
            else{
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}