package ss12_java_collection_framework.Service;


import ss12_java_collection_framework.Model.Product;

public interface ProductServiceInterface {

    void addProduct(Product product);

    void remove();


    void change(int index, Product product);

    void display();

    void find(String name);

    void sort();
}
