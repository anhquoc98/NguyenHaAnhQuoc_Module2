package ss12_lam_lai.Model.Repository;

import ss12_lam_lai.Model.Product;

public interface IPropuctRepo {
    void display();
    void add(Product product);
    Product findById(int id);
    void update(Product product);
    void remove(Product product);
    void seachId(Product product);
    void sort();
}
