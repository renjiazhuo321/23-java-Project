public class Worke extends Builde {
    private Product product;

    public Worke() {
        product = new Product();
    }

    @Override
    Builde BuildeA(String a) {
        product.setBuildeA(a);
        return this;
    }

    @Override
    Builde BuildeB(String b) {
        product.setBuildeB(b);
        return this;
    }

    @Override
    Builde BuildeC(String c) {
        product.setBuildeC(c);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
