class Solution {
    public int numIdenticalPairs(int[] nums) {
       int[] hash =new int[101];
       int sum=0;

       for (int i=0; i< nums.length; i++){
        sum+=hash[nums[i]];
        hash[nums[i]]++;
       }
       return sum;
    }
}