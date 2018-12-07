public class Sorts {


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

  public static void bubbleSort(int[] data) {
    int temp = 0;
    boolean sorted = false;
    while (!sorted) {
      for (int i = 0; i < data.length-1; i++) {
        if (data[i] > data[i+1]) {
          temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
        }
      }
      for (int i = 0; i < data.length-1; i++) {
        if (data[i] < data[i+1])
          sorted = true;
      }
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

  public static void main(String[] args) {
    int[] test = {4, 3, 2, 1, 4, 3, 2, 1};
    int[] test2 = {-1, 50, 2, 900000, -99999, 50, 0};
    int[] test3 = {5, 4, 3, 2, 1, 0};
    selectionSort(test);
    selectionSort(test2);
    bubbleSort(test3);
    System.out.println(printArray(test));
    System.out.println(printArray(test2));
    System.out.println(printArray(test3));
  }

}
