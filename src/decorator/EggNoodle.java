package decorator;

/**
 * Created by jay on 2017/1/13.
 */
public class EggNoodle extends Noodle {

    public EggNoodle() {
        description = "鸡蛋面";
    }

    @Override
    public double cost() {
        return 5;
    }
}
