import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int d;
        int carry = 0;
        int sum;
        int p = num.length - 1;
        while (p >= 0 || k > 0) {
            int digit = 0;
            d = k % 10;
            if (p >= 0)
                digit = num[p];
            sum = digit + d + carry;
            carry = sum / 10;
            int finans = sum % 10;
            p--;
            k = k / 10;
            ans.add(finans);
        }
        if (p < 0 && carry > 0) {
            ans.add(carry);
        }

        Collections.reverse(ans);
        return ans;

    }
}
