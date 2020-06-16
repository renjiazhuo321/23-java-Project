public class TeslaFactory implements Factory {

    @Override
    public Car getCar() {
        return new TeslaCar();
    }

}
