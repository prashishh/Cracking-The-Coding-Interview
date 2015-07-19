/*
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use
 * additional data structures.
 *
 * Assuming that the input string is ASCII strings (A-Z, a-z, 0-9, and punctuations)
 */

/* second attempt without any data structure */
public class OneDotOne2 {

  public boolean checkString(String word) {
    if(word.length() > 256)
      return false;

    int[] val = new int[256];
    for(int i = 0; i < word.length(); i++) {
      int temp = (int)word.charAt(i);
      if(val[temp] == 0)
        val[temp] = 1;
      else
        return false;
    }

    return true;
  }

  public static void main(String args[]) {
    OneDotOne2 inst = new OneDotOne2();
    System.out.println(inst.checkString("Hel.o"));
  }
}