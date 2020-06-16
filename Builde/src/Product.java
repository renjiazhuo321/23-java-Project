public class Product {
    String BuildeA;
    String BuildeB;
    String BuildeC;

    public String getBuildeA() {
        return BuildeA;
    }

    public void setBuildeA(String buildeA) {
        BuildeA = buildeA;
    }

    public String getBuildeB() {
        return BuildeB;
    }

    public void setBuildeB(String buildeB) {
        BuildeB = buildeB;
    }

    public String getBuildeC() {
        return BuildeC;
    }

    public void setBuildeC(String buildeC) {
        BuildeC = buildeC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "BuildeA='" + BuildeA + '\'' +
                ", BuildeB='" + BuildeB + '\'' +
                ", BuildeC='" + BuildeC + '\'' +
                '}';
    }
}
