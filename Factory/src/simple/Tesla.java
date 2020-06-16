package simple;

public class Tesla implements Car {
    String money;

    public String getMoney() {
        System.out.println(money);
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public void name() {
        System.out.println("特斯拉");
    }

}
