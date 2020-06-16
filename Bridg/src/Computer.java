
//电脑类
public class Computer {
    Brand brand;
    //组合品牌进来，方便传进不同的品牌
    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        brand.info();
    }
}
