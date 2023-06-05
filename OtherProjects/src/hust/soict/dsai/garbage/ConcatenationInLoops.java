package hust.soict.dsai.garbage;
import java.util.Random;


public class ConcatenationInLoops {
	public static void main(String[] args) {
        Random r = new Random (123);
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++){
            s += r.nextInt (2);
        }
        System.out.println(System.currentTimeMillis() - start); // This prints roughly 4500.

        r = new Random (123);
        start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100000; i++){
            sb.append(r.nextInt(2));
        }
        s = sb.toString();
        System.out.println(System.currentTimeMillis() - start); // This prints 5.
    }


}
