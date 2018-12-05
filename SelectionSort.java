public class SelectionSort {


  public static void selectionSort(int[] ary) {
    int min = ary[0];
    int index = 0;

    for (int i = 0; i < ary.length; i++) {
      min = ary[i];
      index = i;
      for (int x = i; x < ary.length; x++) {
        if (ary[x] < min) {
          min = ary[x];
          index = x;
        }
      }
      ary[index] = ary[i];
      ary[i] = min;
    }
  }

}
