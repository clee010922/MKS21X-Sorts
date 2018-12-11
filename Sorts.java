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
    for (int i = 0; i < data.length; i++) {
      for (int x = 0; x < data.length - 1; x++) {
        if (data[x] > data[x+1]) {
          temp = data[x];
          data[x] = data[x+1];
          data[x+1] = temp;
        }
      }
    }
  }

  public static void insertionSort(int[] data) {
    int temp = 0;
    int index = 0;
    int newIndex = 0;
    for (int i = 0; i < data.length-1; i++) {
      if (data[i] > data[i+1]) {
        temp = data[i+1];
        index = i+1;
        for (int x = 0; x < data.length; x++) {
          if (temp < data[x])
            newIndex = x;
        }
        for (int j = index; j > newIndex; j--) {
          data[j] = data[j-1];
        }
        data[newIndex] = temp;
      }
    }
  }

  //for(int i = 1; .....)
  //int c;
  //for(int c = i; c > 0 && ary[c] < ary[c-1]; c--)

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
    int[] test3 = {4, 3, 2, 1, 4, 3, 2, 1};
    int[] test4 = {-1, 50, 2, 900000, -99999, 50, 0};

    selectionSort(test);
    selectionSort(test2);
    bubbleSort(test3);
    insertionSort(test4);

    System.out.println(printArray(test));
    System.out.println(printArray(test2));
    System.out.println(printArray(test3));
    System.out.println(printArray(test4));
  }


}
