class Solution {
    public int numberOfMatches(int n) {
        int match=0;
      int temp=n;
      while(temp>0){
            if(temp%2==1 && temp>1){
                  match+=(temp-1)/2 + 1;
            }
            else
                  match+=temp/2;
            temp/=2;
      }
      return match;
    }
}