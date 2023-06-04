package ch1;

import java.util.Arrays;

/**
 * Write code to determine if a string is a permutation of a second string.
 */
public class Q2 {
  public static boolean isPermutation(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }

    char[] chars1 = s1.toCharArray();
    char[] chars2 = s2.toCharArray();

    Arrays.sort(chars1);
    Arrays.sort(chars2);

    for (int i = 0; i < chars1.length; i++) {
      if (chars1[i] != chars2[i]) {
        return false;
      }
    }
    return true;
  }
}
