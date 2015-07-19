import java.util.HashMap;

/*
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use
 * additional data structures.
 *
 * Assuming that the input string is ASCII strings (A-Z, a-z, 0-9, and punctuations)
 */

/* first attempt */
public class OneDotOne1 {

  public boolean checkString( String word ) {
    HashMap<String, Boolean> hashmap = new HashMap<String, Boolean>();

    for (int i = 0; i < word.length(); i++) {
      char temp = word.charAt(i);
      Boolean val = hashmap.get(temp+"");
      if(val != null)
        return false;
      else
        hashmap.put("" + temp, Boolean.TRUE);
    }

    return true;
  }
  public static void main (String args[]) {
    OneDotOne1 inst = new OneDotOne1();
    System.out.println(inst.checkString("sh,dmj_0794.bka"));
  }
}
