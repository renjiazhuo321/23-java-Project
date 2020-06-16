package simple;

public class Factory {
    //简单工厂  也叫静态工厂方式
//    public static Car getCar(String name) {
//        if (name.equals("wulin")) {
//            return new Wulin();
//        }
//        if (name.equals("tesla")) {
//            return new Tesla();
//        }
//        return null;
//    }
//
    //避免单一一个方法编写，不同的类型，使用不同的方法，单一职责
    public static Wulin Wulin() {
        Wulin wulin = new Wulin();
        wulin.setMoney("10W");
        return wulin;
    }

    public static Tesla TesLa() {
        Tesla tesla = new Tesla();
        tesla.setMoney("100w");
        return tesla;
    }
}
