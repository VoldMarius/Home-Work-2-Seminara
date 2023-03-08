package operations;
//Метод решающий задачу найти вхождение в строке (содержащей все символы другой строки).
public class FindEntryString {
    public static void findEntryString(String str, String str_sample) {
        int index1 = str.indexOf(str_sample);//Символ не встречается в строке . Получаем (-1).
        System.out.println(index1 < 0 ? str + "  не содержет все символы в порядке строки  " + str_sample:
                str  + " содержет все символы в порядке строки  " + str_sample +
                " ,вхождение начинается с " +index1);
    }
}
