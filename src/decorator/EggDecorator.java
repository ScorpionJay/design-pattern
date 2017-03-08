package decorator;

/**
 * Created by jay on 2017/1/13.
 */
public class EggDecorator extends NoodleDecorator {

    Noodle noodle;

    public EggDecorator(Noodle noodle) {
        this.noodle = noodle;
    }

    @Override
    public String getDescription() {
        return noodle.getDescription() + ",加鸡蛋";
    }

    @Override
    public double cost() {
        return noodle.cost() + 2;
    }
}
