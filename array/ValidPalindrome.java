public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        // String s = "race a car";
        boolean ans = isPalindrome(s.toLowerCase());
        System.out.println(ans);
    }
    
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", ""); 
        if (s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
