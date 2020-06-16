public class WulinFactory implements Factory {
    @Override
    public Car getCar() {
        return new WulinCar();
    }


}
