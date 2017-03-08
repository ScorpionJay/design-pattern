package factory.simple;

/**
 * Created by jay on 2017/1/12.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Product product = factory.create("mobile");
        product.function();
    }

}
