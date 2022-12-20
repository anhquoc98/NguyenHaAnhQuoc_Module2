package ss12_lam_lai.Model;

public class Product {
    private int id ;
    private String nameProduct;
    private String moneyProduct;

    public Product(int id, String nameProduct, String moneyProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.moneyProduct = moneyProduct;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getMoneyProduct() {
        return moneyProduct;
    }

    public void setMoneyProduct(String moneyProduct) {
        this.moneyProduct = moneyProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", moneyProduct='" + moneyProduct + '\'' +
                '}';
    }
}
