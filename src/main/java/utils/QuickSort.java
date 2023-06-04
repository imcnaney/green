package utils;

import java.util.Comparator;
import java.util.Random;

public class QuickSort<T> {

  private T[] values;
  private Comparator<T> comp;
  private boolean sorted = false;

  public QuickSort(T[] values, Comparator<T> comp) {
    this.values = values;
    this.comp = comp;
  }

  public T[] sort() {
    if (!sorted) {
      sort(0, values.length - 1);
      sorted = true;
    }
    return values;
  }

  /**
   * Sort a sub-array of the main values array.
   * @param start - the first index of the sub-array
   * @param end - the last index of the sub-array
   */
  private void sort(int start, int end) {
    if (end <= start) {
      return;
    }

    int pivot = new Random().nextInt(start, end + 1);
    swap(pivot, end);

    // partition around the pivot
    // the partition starts before the beginning of the array and walks forward as we compare.
    // it's the target of swaps for values that are less than the pivot.
    int partition = start - 1;
    for (int i = start; i < end; i++) {
      if (comp.compare(values[i], values[end]) < 0) {
        partition += 1;
        swap(partition, i);
      }
    }

    // swap the pivot into place
    partition += 1;
    swap(partition, end);

    sort(start, partition - 1);
    sort(partition + 1, end);
  }

  /**
   * Swap two values in the array
   * @param from the index to swap from
   * @param to the index to swap to
   */
  private void swap(int from, int to) {
    if (from != to) {
      T temp = values[from];
      values[from] = values[to];
      values[to] = temp;
    }
  }
}
