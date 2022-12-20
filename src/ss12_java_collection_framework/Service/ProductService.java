package ss12_java_collection_framework.Service;

import ss12_java_collection_framework.Model.Product;
import ss12_java_collection_framework.reprository.ProductRepository;

public class ProductService extends Product implements ProductServiceInterface {
    ProductRepository productRepository =new ProductRepository();

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void remove() {

    }



    @Override
    public void change(int index, Product product) {

    }

    @Override
    public void display() {

    }

    @Override
    public void find(String name) {

    }

    @Override
    public void sort() {

    }
}
