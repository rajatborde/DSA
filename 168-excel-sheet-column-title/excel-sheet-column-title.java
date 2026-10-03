class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
            int digit=0;
            while(n>0){
                  n--;
                  digit=n%26 + 65;
                  char d = (char)digit;
                  result.append(d);
                  n/=26;
            }
      return result.reverse().toString();
    }
}