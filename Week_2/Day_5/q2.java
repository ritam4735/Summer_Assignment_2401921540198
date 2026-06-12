class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;
        int i = 0;

        while (i < n) {
            char current = chars[i];
            int count = 0;

            while (i < n && chars[i] == current) {
                i++;
                count++;
            }

            // Write the character
            chars[write++] = current;

            // Write count if > 1
            if (count > 1) {
                String cnt = String.valueOf(count);

                for (char c : cnt.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}