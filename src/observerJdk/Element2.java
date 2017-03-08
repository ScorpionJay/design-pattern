package observerJdk;

import java.util.*;

/**
 * @author jay
 */
public class Element2 implements DisplayElement, Observer {

    private float temp;
    private float pressure;

    private Observable observable;

    @Override
    public void update(Observable o, Object arg) {
        if ( o instanceof  WeatherData ){
            WeatherData weatherData = (WeatherData)o;
            this.temp = weatherData.getTemp();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    /**
     *
     */
    public void display() {
        System.out.println("element2 display temp:" + temp );
    }

    public Element2( Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void unObserver(){
        observable.deleteObserver (this);
    }

}