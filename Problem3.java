public class Problem3 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.trailingZeroes(30));
    }

}

class Solution {
    public int trailingZeroes(int n) {
        int sum = 0;
        while (n / 5 > 0) {
            sum = sum + n / 5;
            n = n / 5;
        }
        return sum;
    }
}
