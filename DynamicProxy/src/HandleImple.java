import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HandleImple implements InvocationHandler {
    Object object;

    public HandleImple(Object object) {
        this.object = object;
    }

    public Object getObject(){
        TestBean proxyHello = (TestBean) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
        return  proxyHello;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }
}
