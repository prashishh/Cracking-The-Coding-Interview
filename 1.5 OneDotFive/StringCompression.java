
/*
 * Implement a method to perform basic string compression using the counts of 
 * repeated characters. For example: the string aabccccaa would become a2b1c4a2. If 
 * the compressed string would not become smaller than the original string, then 
 * return original string.
 * 
 * 
 */

/* First Attempt */
public class StringCompression {
    
    public StringCompression() {};

    // calculate the size of the new string
    public int countStrings( String str ) {
        char[] newStr = str.toCharArray();

        int size = 0;
        int strCount = 1;
        char temp = newStr[0];

        for ( int i = 1; i < newStr.length; i++ ) {
            if( temp == newStr[i]) {
                strCount++;
            } else {
                temp = newStr[i];
                size += 1 + String.valueOf(strCount).length();
                strCount = 1;
            }
        }

        size += 1 + String.valueOf(strCount).length();
        return size;
    }

    public String compress( String str ) {
        int size = countStrings(str);
        if( size > str.length())        // if new size is greater, return old string
            return str;
        
        char[] newStr = new char[size]; // create new char array with the specific size

        char[] oldStr = str.toCharArray();

        int count = 1;
        int pos = 0;
        char temp = oldStr[0];
       
        for ( int i = 1; i < oldStr.length; i++ ) {
            if( temp == oldStr[i]) {
                count++;
            } else {
                newStr[pos] = temp;
                temp = oldStr[i];
                pos++;
                newStr[pos] = (char) (count + '0');
                pos++;
                count = 1;
            }
        }

        newStr[pos] = temp;
        pos++;
        newStr[pos] = (char) (count + '0');

        str = String.valueOf(newStr);
        return str;

    }
    
    public static void main( String args[] ) {
        String testString = "aaaaaaaabc";
        StringCompression str = new StringCompression();
        System.out.println(testString);
        System.out.println(str.compress(testString));

    }
}
