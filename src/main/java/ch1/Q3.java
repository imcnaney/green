package ch1;

/**
 * Write code to URLify a string - convert all spaces to %20.  Assume that the string is a char
 * array with enough space for the result, and that you receive a parameter of the true length
 * (not URLified) of the string.
 */
public class Q3 {

  // test leading space

  public static void urlify(char[] chars, int trueLength) {
    int tail = trueLength - 1;
    for (int i = chars.length - 1; i > 0; i--) {
      if (chars[tail] != ' ') {
        chars[i] = chars[tail];
      } else {
        chars[i - 2] = '%';
        chars[i - 1] = '2';
        chars[i] = '0';
        i -= 2;
      }
      tail--;
    }
  }
}
