import operations.StringSpinning;
import operations.FindEntryString;
import operations.FindEntryStringRecursion;
import operations.СomposeLines;
import operations.Replaceharacter;
public class Main {
    // 1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
    public static void main(String[] args) {

        String str = "Hello world";
        String str1 = "rld";
        FindEntryString.findEntryString(str, str1);

        // 2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга
        // (вхождение в обратном порядке).
        String str2 = "abracadabra";
        String str3 = "arbadacarba";
        StringSpinning.stringSpinning(str2, str3);


        // 3.Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        String str4 = "Revers string";
        System.out.println("Результат разворота строки: " + FindEntryStringRecursion.reverse(str4));

        // 4.Дано два числа, например 3 и 56, необходимо составить следующие строки:
        // 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        СomposeLines.composer(12,85);

        // 5.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

        System.out.println(Replaceharacter.inserteChar("40 не = 3 + 22","="," равно "));;

        // 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        System.out.println(Replaceharacter.replaceChar("40 = 30 + 10","=","равно"));

        //*Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

        StringBuilder str10 = new StringBuilder();
        for (char i  = 0; i < 10000 ; i++) {
           str10.append(i);
        }
        String str11 = str10.toString();
        long start = System.currentTimeMillis();
        Replaceharacter.replaceChar(str11,"=","равно");
        long finish = System.currentTimeMillis();
        long rez = finish - start;
        System.out.println(" Время выполнения средством String  " +  rez);
        long start1 = System.currentTimeMillis();
        Replaceharacter.strReplaceChar(str11,"=","равно");
        long finish1 = System.currentTimeMillis();
        long rez1 = finish1 - start1;
        System.out.println(" Время выполнения средством  StringBuilder " +  rez1);
    }
}