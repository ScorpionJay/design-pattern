package singleton;

/**
 * Created by jay on 2017/1/11.
 */
public class Singleton2Test {
    public static void main(String[] args) {
        System.out.println(Singleton2.getInstance().hashCode());
        System.out.println(Singleton2.getInstance().hashCode());
    }
}
