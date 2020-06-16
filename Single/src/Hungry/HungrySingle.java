package Hungry;

//饿汉单例模式，缺点是直接就会加载此类，导致内存浪费
public class HungrySingle {
    private HungrySingle() {
    }


    private static final HungrySingle hungrySingle = new HungrySingle();

    public static HungrySingle getInstance() {
        return hungrySingle;
    }
}
