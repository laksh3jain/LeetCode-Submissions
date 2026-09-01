class Solution {
    public int smallestNumber(int n, int t) {
        int product, num;
        while(true) {
            product = 1;
            num = n;
            while(num != 0) {
            product *= num % 10;
            num /= 10;
            }
            if (product % t == 0) {
                return n;
            }
            else {
                n++;
            }
        }
    }
}