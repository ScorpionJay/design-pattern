package observer;

import java.util.*;

/**
 * @author jay
 */
public class Element1 implements DisplayElement, Observer {

    private float temp;
    private float pressure;

    private Subject subject;

    @Override
    public void update( float temp,float pressure) {
        this.temp = temp;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("element1 display temp:" + temp + " , pressure:" + pressure);
    }

    /**
     * Default constructor
     */
    public Element1( Subject subject) {
        subject = subject;
        subject.registerObserver(this);
    }

    public void unObserver(){
        subject.removeObserver(this);
    }

}