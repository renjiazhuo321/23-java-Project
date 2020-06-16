package simple;

public class Peo {
    //简单工厂模式
    public static void main(String[] args) {
        //不使用工厂模式写法，相当于自己是工厂，直接造车，用来对比工厂模式
//        Tesla tesla = new Tesla();
//        tesla.setMoney("100W");
//        tesla.name();
//        tesla.getMoney();
//
//


//        Wulin wulin = new Wulin();
//        wulin.setMoney("10W");
//        wulin.name();
//        wulin.getMoney();

        //简单工厂模式，不属于设计模式中，只是一种简单写法
//        Car car =  Factory.getCar("wulin");
//        car.name();

        Tesla car = Factory.TesLa();
        car.name();
        car.getMoney();


        Wulin car1 = Factory.Wulin();
        car1.name();
        car1.getMoney();
    }
}
