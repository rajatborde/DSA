class Solution {
    public int preimageSizeFZF(int k) {
        long l=0, r=10000000000L;

        while(l<r){
            long m = l + (r-l)/2;
            long t=m;
            int count =0;

            while(t>0){
                t/=5;
                count+=t;
            }
            if(count==k) 
                return 5;
            else if(count<k)  
                l=m+1;
            else 
                r=m-1;
        }
        return 0;
    }
}