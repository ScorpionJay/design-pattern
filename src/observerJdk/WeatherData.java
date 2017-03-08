package observerJdk;

import java.util.*;

/**
 * @author jay
 */
public class WeatherData extends Observable {

    private float temp;
    private float pressure;


    /**
     * Default constructor
     */
    public WeatherData() {

    }




    public void publish(float temp,float pressure){
        this.temp = temp;
        this.pressure = pressure;
       setChanged();
       notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }
}