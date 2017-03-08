package observerJdk;

import java.util.*;

/**
 * @author jay
 */
public class Element1 implements DisplayElement, Observer {

    private float temp;
    private float pressure;

    Observable observable;


    @Override
    public void update(Observable o, Object arg) {
        if ( o instanceof  WeatherData ){
            WeatherData weatherData = (WeatherData)o;
            this.temp = weatherData.getTemp();
            this.pressure = weatherData.getPressure();
            display();
        }
    }


    @Override
    public void display() {
        System.out.println("element1 display temp:" + temp + " , pressure:" + pressure);
    }

    /**
     * Default constructor
     */
    public Element1(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

//    public void unObserver(){
//        weatherData.removeObserver(this);
//    }

}