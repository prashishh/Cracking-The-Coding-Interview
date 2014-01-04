/*
 * A Given two string, write a method to decide if one id the 
 * permutation of the other.
 */

import java.util.ArrayList;

public class Permutation {

    public boolean checkPermutation(String word1, String word2) {
        ArrayList<Character> list = new ArrayList<Character>();

        // store the letters of word1 into an ArrayList
        for (int i = 0; i < word1.length(); i++) 
            list.add(word1.charAt(i));
        
        for (int j = 0; j < word2.length(); j++) {
            int ind = list.indexOf(word2.charAt(j));
            if(ind >= 0) 
                list.remove(ind);   // remove letter if found
             else 
               return false;    // if not found, letter not present
        }

        return true;
    }

    public static void main(String args[]) {
        Permutation p = new Permutation();
        System.out.println(p.checkPermutation("Helello", "llmleHo"));
    }
}