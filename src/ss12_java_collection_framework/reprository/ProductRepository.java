package ss12_java_collection_framework.reprository;

import ss12_java_collection_framework.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    static List<Product> productsList = new ArrayList<>();

//    static {
//        productsList.add(1, "Iphone");
//    }

    @Override
    public void display() {

    }
}
