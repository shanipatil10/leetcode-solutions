class Solution {
    public int theMaximumAchievableX(int num, int t) {
        // int x = num + 2 * t;
        // int original = x;

        // while (x != num) {
        //     if (x > num) {
        //         x--;
        //         num++;
        //     } else {
        //         x++;
        //         num--;
        //     }
        //     t--;
        // }

        // return t==0 && x == num ? original : -1;
        return num+2*t; 
    }
}
