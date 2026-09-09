class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> sl = new ArrayList<Integer>();

        int m= matrix[0].length;
        int n= matrix.length;

        int t=0;
        int r=m-1;
        int b=n-1;
        int l=0;

        while(l<=r && t<=b){
            for(int i=l; i<=r; i++){
                sl.add(matrix[t][i]);
            }t++;

            for(int i=t; i<=b; i++){
                sl.add(matrix[i][r]);
            }r--;

            if (t <= b) {
            for(int i=r; i>=l; i--){
                sl.add(matrix[b][i]);
            }b--;}

            if (l <= r) {
            for(int i=b; i>=t; i--){
                sl.add(matrix[i][l]);
            }l++;}
        }
        return sl;
        
    }
}