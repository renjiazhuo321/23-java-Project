public class ProxyService implements UserService {
    UserService userService;

    //代理逻辑实现，不修改原本的逻辑，代理新增额外的任务
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Override
    public void add() {
        log();
        userService.add();
    }

    @Override
    public void update() {
        log();
        userService.update();
    }

    public void log() {
        System.out.println("打印日志");
    }
}
