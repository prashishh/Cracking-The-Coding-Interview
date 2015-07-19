/*
 * Simple Implementation of Selection Sort
 *
 */

public class SelectionSort1 {

  public static void sortNumbers(int[] data) {
    int dataLength = data.length;

    for(int i = 0; i < dataLength; i++) {
      for(int j = i + 1; j < dataLength; j++) {
        if(data[j] < data[i]) {
          swap(j, i, data);
        }
      }
    }

    printData(data);
  }

  public static void swap(int x, int y, int[] data) {
    data[x] = data[x] + data[y];
    data[y] = data[x] - data[y];
    data[x] = data[x] - data[y];
  }

  private static void printData(int[] data) {
    for(int i = 0; i < data.length; i++)
      System.out.print(data[i] + "\n");
  }

  public static void main(String[] args) {
    int[] data = {99, 23, 14, 44, 14, 66, 2};
    sortNumbers(data);
  }
}