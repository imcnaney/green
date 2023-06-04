package utils;

import static org.junit.jupiter.api.Assertions.*;
import static com.google.common.truth.Truth.assertThat;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

class QuickSortTest {

  @Test
  void testSort() {
    Integer[] numbers = {9, 2, 1, 5, 3, 2, 2, 2, 6};
    QuickSort<Integer> it = new QuickSort<>(numbers, Comparator.naturalOrder());
    Integer[] result = it.sort();
    Integer[] expected = {1, 2, 2, 2, 2, 3, 5, 6, 9};
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void testSortEmptyArray() {
    Integer[] numbers = {};
    QuickSort<Integer> it = new QuickSort<>(numbers, Comparator.naturalOrder());
    Integer[] result = it.sort();
    assertThat(result).isEmpty();
  }
}