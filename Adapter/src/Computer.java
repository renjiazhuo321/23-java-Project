public class Computer {
    //通过适配器，和不同类之间交互，避免直接new类交互
    public static void main(String[] args) {
        new Adapter(new WangXian()).requestNet();//上网

        new Adapter(new PlayerGame()).playerGame();//打游戏
    }
}
