package Lanzy;

//懒汉模式，线程不安全
public class LanzyDoubleSingle {
    private LanzyDoubleSingle() {
    }

    //必须加volatile关键字，
    static volatile LanzyDoubleSingle lanzySingle;

    //双重检测锁 懒汉单例模式
    public static LanzyDoubleSingle getInstance() {
        if (lanzySingle == null) {
            synchronized (LanzyDoubleSingle.class) {
                if (lanzySingle == null) {

                    lanzySingle = new LanzyDoubleSingle();//不是一个原子性操作，
                    /**
                     * 分配内存空间
                     * 执行构造方法，初始化对象
                     * 把这个对象指向这个空间
                     *
                     *
                     * 指令重排现象
                     */
                }
            }
        }
        return lanzySingle;
    }
}
