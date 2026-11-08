class Solution {
    public int findDuplicate(int[] nums) {
        int n= nums.length;

        for(int i=0; i <n; i++){
            int temp=nums[i];
            if(temp<0)
                temp *= -1;
            if(nums[temp]<0)
                return nums[i]<0 ? nums[i] * -1 : nums[i];
            else
                nums[temp] *= -1;
        }
        return -1;
    }
}