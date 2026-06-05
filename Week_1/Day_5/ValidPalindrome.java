class Solution {
    public boolean isPalindrome(String s) {

        int leftGoblin = 0;
        int rightGoblin = s.length() - 1;

        while (leftGoblin < rightGoblin) {

            while (leftGoblin < rightGoblin &&
                   !Character.isLetterOrDigit(s.charAt(leftGoblin))) {
                leftGoblin++;
            }

            while (leftGoblin < rightGoblin &&
                   !Character.isLetterOrDigit(s.charAt(rightGoblin))) {
                rightGoblin--;
            }

            char leftRune = Character.toLowerCase(s.charAt(leftGoblin));
            char rightRune = Character.toLowerCase(s.charAt(rightGoblin));

            if (leftRune != rightRune) {
                return false;
            }

            leftGoblin++;
            rightGoblin--;
        }

        return true;
    }
}