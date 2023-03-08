package operations;

import java.sql.SQLOutput;

//метод проверяет, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
public class StringSpinning {
    public static void stringSpinning(String strInitial,String sample) {

        String sb = new StringBuilder(sample).reverse().toString();
        System.out.println(strInitial.equals(sb) ?  "строки  " + sample + " и " + strInitial + " вращение друг друга "
                :" строки " + sample + " и " + strInitial +" не вращение друг друга ");
    }

}
