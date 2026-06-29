class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean check[] = new boolean[126];
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            check[jewels.charAt(i)] = true;
        }
        for (int i = 0; i < stones.length(); i++) {
            if (check[stones.charAt(i)]) {
                count++;
            }
        }
        return count;
        // HashSet<Character> hs = new HashSet<>();
        // int count = 0;
        // for (int i = 0; i < jewels.length(); i++) {
        //     char ch = jewels.charAt(i);
        //     hs.add(ch);
        // }
        // for (int i = 0; i < stones.length(); i++) {
        //     char ch = stones.charAt(i);
        //     if (hs.contains(ch)) {
        //         count++;
        //     }
        // }
        // return count;
    }
}
