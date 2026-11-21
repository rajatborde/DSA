class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int n = fruits.length;
        int w=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int r=0; r<n; r++){
            if(map.size()>2){
                map.put(fruits[l], map.getOrDefault(fruits[l], 0) -1);
                if(map.get(fruits[l])<=0){
                    map.remove(fruits[l]);
                }
                l++;
                map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            }else{
                map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            }
            if(map.size()<=2)
                w=Math.max(w, r-l+1);
        }
        return w;
    }
}