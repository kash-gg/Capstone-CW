

import java.util.Arrays;
public class anagram {

    public boolean TwoStringAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray(); 

     
        Arrays.sort(a);
        Arrays.sort(b); 

        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        anagram obj = new anagram();

        String s = "listen";
        String t = "silent";

        if (obj.TwoStringAnagram(s, t)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}