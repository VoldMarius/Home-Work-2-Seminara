package operations;

public class –°omposeLines {

    public static void composer(int x,int y){
        StringBuilder com = new StringBuilder();
        com.append(x + " + " + y +" = "+ (x+y) +"\n"
                + x + " - " + y +" = "+ (x-y)+"\n"
                + x + " * " + y +" = "+ (x*y));

        System.out.println(com);

    }
}
