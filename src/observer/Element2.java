package observer;

import java.util.*;

/**
 * @author jay
 */
public class Element2 implements DisplayElement, Observer {

    private float temp;
    private float pressure;

    private Subject subject;

    /**
     * Default constructor
     */
    @Override
    public void update( float temp,float pressure) {
        this.temp = temp;
        this.pressure = pressure;
        display();
    }

    /**
     * 
     */
    public void display() {
        System.out.println("element2 display temp:" + temp );
    }

    public Element2( Subject weathSubject) {
        subject = weathSubject;
        subject.registerObserver(this);
    }

    public void unObserver(){
        subject.removeObserver(this);
    }

}