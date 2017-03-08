package observer;

import java.util.*;

/**
 * @author jay
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temp;
    private float pressure;


    /**
     * Default constructor
     */
    public WeatherData() {
        observers = new ArrayList<>();
    }

    /**
     * 
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 
     */
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0){
            observers.remove(i);
        }
    }

    /**
     * 
     */
    public void notifyObserver() {
        for (int i = 0; i < observers.size() ; i++) {
            observers.get(i).update(temp,pressure);
        }
    }

    public void publish(float temp,float pressure){
        this.temp = temp;
        this.pressure = pressure;
        notifyObserver();
    }

}