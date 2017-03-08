package jdk8;

/**
 * Created by jay on 2017/1/16.
 */
public interface ITest {

    void test1();

    default void test2(){
        System.out.println("扩展方法");
    }

}
