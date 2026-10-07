class Solution {
    public boolean canArrange(int[] input, int k) {
        int[] hash = new int[k];

        for(int i=0; i<input.length;i++){
            int rem = input[i]%k;
            if (rem<0)
                rem+=k;
            hash[rem]++;
        }
        int count =0 ;
        count += hash[0]/2;
        for(int i=1; i<=k/2; i++){
           if (i == k - i) {
                // When i == k/2 for even k, elements pair with themselves
                count += hash[i] / 2;
            } else {
                count += Math.min(hash[i], hash[k - i]);
            }
        }
        return ((input.length)/2 == count);
    }
}