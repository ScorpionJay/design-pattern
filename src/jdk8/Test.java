package jdk8;

/**
 * Created by jay on 2017/1/16.
 */
public class Test implements  ITest {

    @Override
    public void test1() {
        System.out.println("test1");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.test1();
        t.test2();
    }

}
