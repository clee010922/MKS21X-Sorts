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

  public static String printArray(int[] ary) {
    String result = "[";
    for (int i = 0; i < ary.length; i++) {
      result += ary[i];
      if (i != ary.length - 1)
        result += ", ";
    }
    result += "]";
    return result;
  }


}
