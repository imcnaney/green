package ch1;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

class Q1Test {

  @Test
  public void testIsAllUniqueAscii() {
    Q1 it = new Q1("uniq");
    assertThat(it.isAllUniqueAscii()).isTrue();

    Q1 it2 = new Q1("notunique");
    assertThat(it2.isAllUniqueAscii()).isFalse();

    Q1 it3 = new Q1("n");
    assertThat(it3.isAllUniqueAscii()).isTrue();
  }

  @Test
  public void testIsAllUniqueUnicode() {
    Q1 it = new Q1("ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎ");
    assertThat(it.isAllUniqueUnicode()).isTrue();;

    Q1 it2 = new Q1("ㅋㅌㅍㅎㅋㅌㅍㅎ");
    assertThat(it2.isAllUniqueUnicode()).isFalse();

    Q1 it3 = new Q1("ㅋ");
    assertThat(it3.isAllUniqueUnicode()).isTrue();
  }

  @Test
  public void testIsAllUniqueNoExtraSpace() {
    Q1 it = new Q1("ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎ");
    assertThat(it.isAllUniqueNoExtraSpace()).isTrue();;

    Q1 it2 = new Q1("ㅋㅌㅍㅎㅋㅌㅍㅎ");
    assertThat(it2.isAllUniqueNoExtraSpace()).isFalse();

    Q1 it3 = new Q1("ㅋ");
    assertThat(it3.isAllUniqueNoExtraSpace()).isTrue();
  }
}