package Sort.Test;

import Sort.SortAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

class SortAlgorithmTest {

  private int[] array;
  private int[] afterSort;
  private int length;
  private final SortAlgorithm sortAlgorithm = new SortAlgorithm();

  @BeforeEach
  void setUp() {
    int[] data = {1, 2, 4, 3, 66, 53, 62, 553, 536, 224, 24, 35, 62, 4};
    afterSort = new int[]{1, 2, 3, 4, 4, 24, 35, 53, 62, 62, 66, 224, 536, 553};
    array = data;
    length = array.length;
  }

  @Test
  public void should_return_sorted_array_when_bubble_test() {
    int[] sortedArray = sortAlgorithm.bubbleSort(array);
    assertArrayEquals(afterSort, sortedArray);
  }

  @Test
  public void should_return_sorted_array_when_fast_test() {
    int[] sortedArray = sortAlgorithm.fastSort(array);
    assertArrayEquals(afterSort, sortedArray);
  }

}