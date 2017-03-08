package observer;

import java.util.*;

/**
 * @author jay
 */
public class Element3 implements DisplayElement, Observer {

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
        System.out.println("element3 display temp:" + temp + " , pressure:" + pressure);
    }

    public Element3(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void unObserver(){
        subject.removeObserver(this);
    }
}