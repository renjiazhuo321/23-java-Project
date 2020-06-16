package Lanzy;

//懒汉模式，线程不安全
public class LanzySingle {
    private LanzySingle() {
    }

    static LanzySingle lanzySingle;

    //懒汉单例模式
    public static LanzySingle getInstance() {
        if (lanzySingle == null) {
            lanzySingle = new LanzySingle();//不是一个原子性操作，
        }
        return lanzySingle;
    }
}
