package ch1;

import static org.junit.jupiter.api.Assertions.*;
import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

class Q3Test {

  @Test
  void urlify() {
    char[] s1 = {'b', 'o', 'b', ' ', 'd', 'o', 'l', 'e', '_', '_'};
    char[] e1 = {'b', 'o', 'b', '%', '2', '0', 'd', 'o', 'l', 'e'};

    Q3.urlify(s1, 8);
    assertThat(s1).isEqualTo(e1);
  }

  @Test
  void urlifyLeadingSpace() {
    char[] s1 = {' ', 'b', 'o', 'b', ' ', 'd', 'o', 'l', 'e', '_', '_', '_', '_'};
    char[] e1 = {'%', '2', '0', 'b', 'o', 'b', '%', '2', '0', 'd', 'o', 'l', 'e'};

    Q3.urlify(s1, 9);
    assertThat(s1).isEqualTo(e1);
  }
}