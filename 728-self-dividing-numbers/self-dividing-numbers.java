import java.util.ArrayList;
import java.util.List;

class Solution {
    public List selfDividingNumbers(int left, int right) {
        List result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean isSelfDividing(int n) {
        if (n < 10) {
            return true;
        }

        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
            temp /= 10;
        }

        return true;
    }
}