package ss12_java_collection_framework.Model;

public class Product {
    int id ;
    String NameProduct;

    public Product() {
    }

    public Product(int id, String nameProduct) {
        this.id = id;
        NameProduct = nameProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return NameProduct;
    }

    public void setNameProduct(String nameProduct) {
        NameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", NameProduct='" + NameProduct + '\'' +
                '}';
    }
}
