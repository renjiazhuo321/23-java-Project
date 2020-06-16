public interface TestBean {
    void test();

    class TestB implements TestBean {
        @Override
        public void test() {
            System.out.println("测试");
        }
    }
}
