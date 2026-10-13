class Solution {
    public int singleNumber(int[] input) {
        int number=0;
        for(int j=0; j < 32; j++){
            int count=0;
        for(int i=0; i <input.length; i++){
            int temp = input[i];
            if(((temp>>>j)&1) != 0)
            count++;
        }
        if(count%3!=0){
            number = number | (1<<j);
        }
        }
        return number;
    }
}