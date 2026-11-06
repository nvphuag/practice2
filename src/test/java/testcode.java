import java.util.Arrays;
import java.util.HashMap;

public class testcode {
    public static void main (String[] args){
        Sum();
    }

    public static void Sum() {

        int a= 0;

        for (int i = 1; i <= 10; i++) {
            a = a + i;
        }

        System.out.println("result: "+a);
    }
}
