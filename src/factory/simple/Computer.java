package factory.simple;

/**
 * Created by jay on 2017/1/12.
 */
public class Computer implements Product{

    @Override
    public void function() {
        System.out.printf("play pc games...");
    }
}
