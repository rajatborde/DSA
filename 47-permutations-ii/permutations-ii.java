class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] input) {
        Arrays.sort(input);
         ans = new ArrayList<>();
         helper(input, new ArrayList<>(), new boolean[input.length]);
        return ans;
    }
    static void helper(int[] arr, ArrayList<Integer> used, boolean[] visited){
     if(arr.length == used.size()){
          ans.add(new ArrayList<>(used));
          return;
     }
     for(int i=0; i<arr.length; i++){
          if(visited[i] || (i>0 && arr[i]==arr[i-1] && visited[i-1] == false)) continue;
               used.add(arr[i]);
               visited[i]= true;
               helper(arr, used, visited);
               used.remove(used.size() - 1);
               visited[i]=false;
    }
    } 
}