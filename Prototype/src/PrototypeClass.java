import javax.xml.crypto.Data;

public class PrototypeClass {
    //原型模式，也就是克隆模式，相当于克隆一个类


    public static void main(String[] args) {
        TestClass testClass = new TestClass("测视1");
        Peo peo = new Peo(testClass, "1");
        try {
            Peo peo1 = (Peo) peo.clone();
            testClass.testName = "测试2";
            System.out.println(peo.toString() + ">>" + peo.getData().testName + "--------" + peo1.toString() + ">>>" +
                    ">>" + peo1.getData().testName);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
