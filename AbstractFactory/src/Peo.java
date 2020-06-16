public class Peo {
    //抽象工厂方法
    public static void main(String[] args) {
        WulinFactory wulinFactory = new WulinFactory();
        Car wulinCar = wulinFactory.getCar();
        wulinCar.getCarName();



        TeslaFactory teslaFactory = new TeslaFactory();
        Car teslaCar = teslaFactory.getCar();
        teslaCar.getCarName();




    }
}
