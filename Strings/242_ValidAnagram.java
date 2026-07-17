import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
    // public static void main(String[] args) {
    //     ValidAnagram v = new ValidAnagram();
    //     System.out.println(v.isAnagram("ananandnan","annananna"));
    // }
}