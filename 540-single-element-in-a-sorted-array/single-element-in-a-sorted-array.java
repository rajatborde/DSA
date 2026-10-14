class Solution {
    public int singleNonDuplicate(int[] input) {
        int l=0, r=input.length-1;
     
     while(l<r){
          int m = l + (r-l)/2;

          if(input[m]==input[m^1])
               l=m+1;
          else
               r=m;
     }
     return input[l];
    }
}