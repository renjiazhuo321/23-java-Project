import java.lang.reflect.Proxy;

public class Test {
    //动态代理
    public static void main(String[] args) {
        TestBean testBean = new TestBean.TestB();
        HandleImple handleImple = new HandleImple(testBean);
        //通过动态代理的反射类，必须是实现了接口的类，不然会强转失败
        TestBean testBean1 = (TestBean) handleImple.getObject();
        testBean1.test();
    }
}
