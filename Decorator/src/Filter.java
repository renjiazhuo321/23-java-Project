public class Filter extends Decorator {
    //继承自装饰着，实现自己独有的操作
    public Filter(TakePic takePic) {
        super(takePic);
    }

   
    @Override
    public void takeP() {
        System.out.println("滤镜");
    }
}
