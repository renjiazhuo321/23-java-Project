package Enum;

//枚举创建单例模式
public enum EnumClass {
    INSTANCE;


    public static EnumClass getInstance() {
        return INSTANCE;
    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(EnumClass.getInstance());
//                }
//            }).start();
//        }
//
//    }
}
