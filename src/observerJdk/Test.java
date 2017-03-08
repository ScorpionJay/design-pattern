package observerJdk;

/**
 * Created by jay on 2017/1/12.
 */
public class Test {

    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        Element1 e1 = new Element1(w);
        Element2 e2 = new Element2(w);





        w.publish(10,20);

        System.out.println("---------------------");

        e2.unObserver();
        Element3 e3 = new Element3(w);

        w.publish(10,200);
    }

}
