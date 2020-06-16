public abstract class Decorator implements TakePic {
    //装饰着，抽象的类
    public Decorator(TakePic takePic) {
        takePic.takeP();
    }

}
