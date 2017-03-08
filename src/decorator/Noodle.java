package decorator;

/**
 * Created by jay on 2017/1/13.
 */
public abstract class Noodle {

    String description = "unknow";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
