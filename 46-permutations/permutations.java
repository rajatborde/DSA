class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] input) {
     ans = new ArrayList<>();
     helper(input, new ArrayList<>());
     return ans;
    }

    void helper(int[] arr, ArrayList<Integer> used){
     if(arr.length == used.size()){
          ans.add(new ArrayList<>(used));
          return;
     }
     for(int i=0; i<arr.length; i++){
          if(!used.contains(arr[i])){
               used.add(arr[i]);
               helper(arr, used);
               used.removeLast();
          }
     }
    } 
}