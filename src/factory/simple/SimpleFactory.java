package factory.simple;

/**
 * Created by jay on 2017/1/12.
 */
public class SimpleFactory {

    private Product product;

    public Product create(String type){
        switch (type){
            case "mobile":
                product = new Mobile();
                break;
            case "computer":
                product = new Computer();
                break;
            case "car":
                product = new Car();
                break;
            default:
        }
        return product;
    }

}
