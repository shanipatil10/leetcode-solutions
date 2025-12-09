class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int revnum = 0;
        if (n < 0) {
            return false;
        }
        while (n > 0) {
            int y = n % 10;
            revnum = revnum * 10 + y;
            n = n / 10;

        }
        if (revnum == x) {
            return true;
        } else {
            return false;
        }

    }
}
