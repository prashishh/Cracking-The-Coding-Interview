
/*
 * Assume you have a method isSubstring which checks if one word is a 
 * substring of another. Given two strings, s1 and s2, write code to check if 
 * s1 is a rotation of s1 using only one call to isSubstring (e.g. "waterbottle" 
 * is a rotation of "erbottlewat")
 * 
 * 
 */

/* First Attempt */
public class SubString {

    public SubString() {};
    
    public boolean checkRotation( String string1, String string2 ) {
        if( string1.length != string2.length )
            return false;

        String newString = string1 + string1;

        if ( isSubstring(newString, string2) )
            return true;
        else 
            return false;
    }    
}
