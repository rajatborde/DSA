class Solution {
    public int[] twoSum(int[] input, int target) {
        int l=0, r= input.length-1;

        while(l<r){
          if(input[l] + input[r] == target)
               return new int[]{l+1 ,r+1};

          else if(input[l] + input[r] > target)
               r--;
          else
               l++;
        }

        return new int[]{-1, -1};
    }
}