class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder new_str = new StringBuilder();
        for (char c: s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                new_str.append(Character.toLowerCase(c));

            }

        }
        return new_str.toString().equals(new_str.reverse().toString());
        
    }
}
