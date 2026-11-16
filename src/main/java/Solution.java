class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while (sb.length() > k) {
            StringBuilder nsb = new StringBuilder();
            int sum = sb.charAt(0) - '0';
            for (int i = 1; i < sb.length(); i++) {
                sum += sb.charAt(i) - '0';
                if ((i + 1) % k == 0 || i == sb.length() - 1) {
                    nsb.append(sum);
                    sum = 0;
                }

            }
            sb = nsb;
        }
        return sb.toString();
    }
}