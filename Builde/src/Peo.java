public class Peo {
    public static void main(String[] args) {

        //创建工程，调用建造房子步骤
        Worke worke = new Worke();
        worke.BuildeA("制造").BuildeB("粉刷").BuildeC("装修");
        System.out.println(worke.getProduct().toString());
    }


}
