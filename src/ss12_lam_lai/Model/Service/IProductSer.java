package ss12_lam_lai.Model.Service;

import ss12_lam_lai.Model.Product;

public interface IProductSer {
    void display();
    void add(Product product);
    Product findById(int id);
    void update(Product product);
    void remove(Product product);
    void seachId(Product product);
    void sort();
}
