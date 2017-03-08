package singleton;

/**
 * Created by jay on 2017/1/11.
 */
public class Singleton2 {

    private static Singleton2 singleton = new Singleton2();

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return singleton;
    }


}
