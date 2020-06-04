package Strings;

/**
 * JStringBuilder
 *
 * @author Roberto Garrido Trillo
 */
public class Stringbuilder {

    private void uno () {
        // create a StringBuilder object usind StringBuilder() constructor 
        StringBuilder str1 = new StringBuilder();
        str1.append("123456789\nABCDEFGIJK");
        System.out.println("str1 = " + str1.toString());

        // create a StringBuilder object usind StringBuilder(CharSequence) constructor 
        StringBuilder str2 = new StringBuilder("ABCD,FGHIJKLM");
        System.out.println("str = " + str2.toString());

        // create a StringBuilder object  usind StringBuilder(capacity) constructor 
        StringBuilder str3 = new StringBuilder(10);
        System.out.println("str1 capacity = " + str3.capacity());

        // create a StringBuilder object usind StringBuilder(String) constructor 
        StringBuilder str4 = new StringBuilder(str2);
        System.out.println("str2 = " + str4.toString());
        

        
        // append with unicode 'C' and ','
        str4.appendCodePoint(67).appendCodePoint(44);
        System.out.println("str2 + \"C\" = " + str4.toString());
        
        // append with numbre unicode '44' equals','
        str4.appendCodePoint(44);
        System.out.println("str2 + \"C\" = " + str4.toString());
        

        
        // Returns the number of Unicode code points in the specified text range of this sequence.
        int x = str4.codePointAt(4);
        System.out.println("str4 - index 4 = " + x);
        
        // Returns the character (Unicode code point) at the index 4 (44 = ,)
        char y = str4.charAt(4);
        System.out.println("str4 - index 4 = " + y);
        
        
        // returns the index of the first occurrence of the passed substring,
        x = str4.indexOf(",");
        System.out.println("index of string ',' = " + x); 
        x = str4.indexOf("KLM");
        System.out.println("index of string 'KLM' = " + x); 
    }

    public static void main (String[] args) {
        Stringbuilder sb = new Stringbuilder();
        sb.uno();
    }
}
