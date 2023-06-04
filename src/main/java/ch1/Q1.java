package ch1;

import java.util.Comparator;
import utils.QuickSort;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * P2 - What if you can't use any extra space?
 */
public class Q1 {

  private String str;

  public Q1(String str) {
    this.str = str;
  }

  public boolean isAllUniqueAscii() {
    // a couple of ways - iterate through and keep a count of each character, which works for small
    // alphabet.  O(n)

    boolean[] seen = new boolean['z'-'a' + 1];
    char[] chars = str.toCharArray();
    for (char c : chars) {
      if (seen[c - 'a']) {
        return false;
      }
      seen[c - 'a'] = true;
    }
    return true;
  }

  public boolean isAllUniqueUnicode() {
    // or sort the characters of the string O(n log n) and then iterate through and check if two
    // adjacent chars are identical O(n)
    Character[] chars = str.chars().mapToObj(c -> (char)c).toArray(Character[]::new);

    QuickSort<Character> qs = new QuickSort<>(chars, Comparator.naturalOrder());
    Character[] sorted = qs.sort();

    for (int i = 0; i < sorted.length - 1; i++) {
      if (sorted[i].equals(sorted[i + 1])) {
        return false;
      }
    }
    return true;
  }

  public boolean isAllUniqueNoExtraSpace() {
    // dumb iteration
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length - 1; i++) {
      for (int j = i + 1; j < chars.length; j++) {
        if (chars[i] == chars[j]) {
          return false;
        }
      }
    }
    return true;
  }
}
