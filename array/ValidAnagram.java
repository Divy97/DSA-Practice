// Given two strings s and t, return true if t is an anagram of s,
// and false otherwise. An Anagram is a word or phrase formed by 
// rearranging the letters of a different word or phrase, typically
// using all the original letters exactly once.

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "cara";
        String t = "cras";

        boolean ans = isAnagramTwo(s, t);
        System.out.print(ans);
    }

    public static boolean isAnagramOne(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arrayOne = s.toCharArray();
        char[] arrayTwo = t.toCharArray();

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        return Arrays.equals(arrayOne, arrayTwo);
    }

    public static boolean isAnagramTwo(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mapForS = new HashMap<>();
        HashMap<Character, Integer> mapForT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (mapForS.containsKey(s.charAt(i))) {
                mapForS.put(s.charAt(i), mapForS.get(s.charAt(i)) + 1);
            } else {
                mapForS.put(s.charAt(i), 1);
            }


            if (mapForT.containsKey(t.charAt(i))) {
                mapForT.put(t.charAt(i), mapForT.get(t.charAt(i)) + 1);
            } else {
                mapForT.put(t.charAt(i), 1);
            }
        }

        for(Character key : mapForS.keySet()) {
            if (!mapForT.containsKey(key)) {
                return false;
            }
            if (!mapForS.get(key).equals(mapForT.get(key))) {
                return false;
            }
        }
        return true;
    }

}
