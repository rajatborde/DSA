class Solution {
    public int numSpecial(int[][] mat) {
        int a = mat.length;
        int b = mat[0].length;
        int i,j;

        int[] row = new int[b];
        int[] col = new int[a];
        int ans = 0;

        for(i=0; i<a; i++){
            for (j=0; j<b; j++){
                if(mat[i][j]==1){
                    col[i]++;
                    row[j]++;
                }
            }
        }

        for(i=0; i<a; i++){
            for (j=0; j<b; j++){
                if(mat[i][j]==1 && col[i]==1 && row[j]==1){
                    ans++;
                }
            }
        }
        return ans;
    }
}