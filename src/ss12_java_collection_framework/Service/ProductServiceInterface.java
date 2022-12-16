package ss12_java_collection_framework.Service;


import ss12_java_collection_framework.Model.Product;

public interface ProductServiceInterface {
    ProductService[] findAll();

    void addProduct(Product product);

    void remove();

    void menu();

    void change(int index, Product product);

    void display();

    void find(String name);

    void sort();
}
