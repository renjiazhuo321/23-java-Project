public class TestClass implements Cloneable {
    String testName;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public TestClass(String testName) {
        this.testName = testName;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}
