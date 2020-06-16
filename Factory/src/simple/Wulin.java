package simple;

public class Wulin implements Car {
    String money;

    @Override
    public void name() {
        System.out.println("五菱宏光");
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getMoney() {
        System.out.println(money);
        return money;
    }
}
