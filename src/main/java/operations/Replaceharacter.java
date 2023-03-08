package operations;

public class Replaceharacter {
    public static StringBuilder inserteChar(String strInitial, String charecter, String charecter1) {
        StringBuilder strIn = new StringBuilder(strInitial);
        int index = strIn.indexOf(charecter);
        strIn.deleteCharAt(index).insert(index - 1, charecter1);
        ;

        return strIn;
    }
    public static String strReplaceChar(String strInitial, String character, String changeTo) {
        strInitial.replace(character, changeTo);
        ;

        return strInitial;
    }
    public static StringBuilder replaceChar(String strInitial, String character, String changeTo) {
        StringBuilder strIn = new StringBuilder(strInitial);
        int index = strIn.indexOf(character);
        strIn.replace(index, index+1,changeTo );
        ;

        return strIn;

    }
}