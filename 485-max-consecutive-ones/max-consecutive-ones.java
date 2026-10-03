class Solution {
    public int findMaxConsecutiveOnes(int[] input) {
        int c=0;
        int m=0;

        for(int i=0; i<input.length; i++){
            if(input[i]==1){
                c++;
                if(m<c)
                    m=c;
            }
            else{
                c=0;
            }
        }
        return m;
    }
}