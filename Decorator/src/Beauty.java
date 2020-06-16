public class Beauty extends Decorator {
    //继承自装饰着，实现自己独有的装饰
    public Beauty(TakePic takePic) {
        super(takePic);
    }

    @Override
    public void takeP() {
        System.out.println("美颜");
    }
}
