import javax.xml.crypto.Data;

public class Peo implements Cloneable {
    TestClass data;
    String age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Peo peo = (Peo) super.clone();
        peo.data = (TestClass) this.data.clone();

        return peo;
    }

    public Peo(TestClass data, String age) {
        this.data = data;
        this.age = age;
    }

    public Peo() {
    }

    public TestClass getData() {
        return data;
    }

    public void setData(TestClass data) {
        this.data = data;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Peo{" +
                "data=" + data +
                ", age='" + age + '\'' +
                '}';
    }
}
