package singleton;

/**
 * Created by jay on 2017/1/11.
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){

        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }


}
