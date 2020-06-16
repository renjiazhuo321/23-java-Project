
//真正的转换器实现
public class Adapter implements UsbClass {
    WangXian wangXian;
    PlayerGame playerGame;
    //组合进来
    Adapter(WangXian wangXian) {
        this.wangXian = wangXian;
    }

    Adapter(PlayerGame playerGame) {
        this.playerGame = playerGame;
    }

    @Override
    public void requestNet() {
        //做一些其他的辅助操作，比如安装驱动，假设没有安装驱动无法直接上网

        wangXian.getNet();  //可以上网
    }

    @Override
    public void playerGame() {
        //做一些其他的辅助操作，比如充值才可以玩游戏
        playerGame.playGame();
    }


}
