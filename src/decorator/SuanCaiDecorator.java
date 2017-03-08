package decorator;

/**
 * Created by jay on 2017/1/13.
 */
public class SuanCaiDecorator extends NoodleDecorator {

    Noodle noodle;

    public SuanCaiDecorator(Noodle noodle) {
        this.noodle = noodle;
    }

    @Override
    public String getDescription() {
        return noodle.getDescription() + " ,加酸菜";
    }

    @Override
    public double cost() {
        return 1 + noodle.cost();
    }


}
