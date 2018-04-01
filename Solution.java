import java.util.*;
public class Solution {
    String solution(String S) {
        int[] occurrences = new int[26];
        String s = new String();
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
            if(occurrences[ch - 'a']%2 == 1)
              s = s + Character.toString(ch);
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (char ch : S.toCharArray()) {
            if (occurrences[ch - 'a'] > best_res) {
                best_char = ch;
                best_res  = occurrences[ch - 'a'];
            }
        }

        return Character.toString(best_char);
    }
  public static void main (String[] args)
  {
    Solution s = new Solution();
    System.out.println(s.solution("carrrrccc"));
  }
}
