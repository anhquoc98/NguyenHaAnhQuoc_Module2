package ss17_IOBinary_Serializtion.ManagerProduct.Contror.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 2L;
    int idProduct;
    String namesProduct;
    String placeOfProduct;
    double price;
    String colorProduct;

    public Product() {
    }

    public Product(int idProduct, String namesProduct, String placeOfProduct, double price, String colorProduct) {
        this.idProduct = idProduct;
        this.namesProduct = namesProduct;
        this.placeOfProduct = placeOfProduct;
        this.price = price;
        this.colorProduct = colorProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNamesProduct() {
        return namesProduct;
    }

    public void setNamesProduct(String namesProduct) {
        this.namesProduct = namesProduct;
    }

    public String getPlaceOfProduct() {
        return placeOfProduct;
    }

    public void setPlaceOfProduct(String placeOfProduct) {
        this.placeOfProduct = placeOfProduct;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public String getColorProduct() {
        return colorProduct;
    }

    public void setColorProduct(String colorProduct) {
        this.colorProduct = colorProduct;
    }

    @Override
    public String toString() {
        return "ProductNhiPhan{" +
                "idProduct=" + idProduct +
                ", namesProduct='" + namesProduct + '\'' +
                ", placeOfProduct='" + placeOfProduct + '\'' +
                ", price=" + price +
                ", colorProduct='" + colorProduct + '\'' +
                '}';
    }
}

