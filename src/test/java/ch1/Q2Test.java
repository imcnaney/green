package ch1;

import static org.junit.jupiter.api.Assertions.*;
import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

class Q2Test {

  @Test
  void isPermutation() {
    assertThat(Q2.isPermutation("asd f", "fs ad")).isTrue();
    assertThat(Q2.isPermutation("abcd", "abce")).isFalse();
  }
}