/*
 * Simple Implementation of Insertion Sort
 *
 */
public class InsertionSort1 {

  public static void sortNumbers(int[] data) {
    int dataLength = data.length;
    int k;
    for(int i = 0; i < dataLength-1; i++) {
      k = i;
      if(data[k] > data[k+1]) {
        swap(k, k+1, data);
        while(k > 0 && data[k-1] > data[k]) {
          swap(k, k-1, data);
          k--;
        }
      }
    }
    printData(data);
  }

  private static void swap(int x, int y, int[] data) {
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