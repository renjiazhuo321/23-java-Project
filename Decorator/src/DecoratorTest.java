public class DecoratorTest {
    public static void main(String[] args) {
        TakePic takePic = new Beauty(new Filter(new TakePicImple()));
        takePic.takeP();
    }

}
