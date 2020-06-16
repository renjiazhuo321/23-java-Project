package Holder;

//静态内部内单例模式
public class Holder {
    private Holder() {
    }

    public static Holder getInstance() {
        return InnerClass.holder;
    }

    public static class InnerClass {
        static Holder holder = new Holder();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Holder holder = getInstance();
                    System.out.println(holder + "");
                }
            }).start();
        }

    }
}
