package decorator;

/**
 * Created by jay on 2017/1/13.
 */
public class Test {

    public static void main(String[] args) {

        // 鸡蛋面 + 酸菜
        Noodle nodle = new EggNoodle();
        SuanCaiDecorator sc = new SuanCaiDecorator(nodle);
        EggDecorator egg = new EggDecorator(sc);

        System.out.println(egg.getDescription()  +"。金额： "+ egg.cost());
    }

}
