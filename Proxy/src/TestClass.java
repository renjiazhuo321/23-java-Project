public class TestClass {
    //静态代理模式，中间添加一个代理来处理额外的问题，不修改原本的逻辑
    public static void main(String[] args) {
        UserServiceImple userServiceImple = new UserServiceImple();
        ProxyService proxyService = new ProxyService();
        proxyService.setUserService(userServiceImple);
        proxyService.add();
    }
}
