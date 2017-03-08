package singleton;

/**
 * Created by jay on 2017/1/11.
 */
public class SingletonTest {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().hashCode());
        System.out.println(Singleton.getInstance().hashCode());
    }

}
