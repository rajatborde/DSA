class Solution {
    public int trailingZeroes(int n) {
        int temp = n;
            int count = 0;
            while(temp>0){
                  temp/=5;
                  count += temp;
            }
            return count;
    }
}