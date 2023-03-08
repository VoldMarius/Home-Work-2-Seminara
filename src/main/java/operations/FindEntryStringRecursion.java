package operations;

public class FindEntryStringRecursion {
    // Метод реверсирования строки в Java с использованием рекурсии
    public static String reverse(String str)
    {
            if (str == null || str.equals("")) {
            return str;
        }
        return str.charAt(str.length() - 1) +
                reverse(str.substring(0, str.length() - 1));
    }
}
