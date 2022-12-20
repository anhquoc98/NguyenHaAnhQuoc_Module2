package ss12_lam_lai.Model.Repository;

import ss12_lam_lai.Model.Product;
import ss12_lam_lai.Model.Service.ProductSer;

public class ProductRepo implements IPropuctRepo {
    ProductSer productSer = new ProductSer();

    @Override
    public void display() {
        productSer.display();
    }

    @Override
    public void add(Product product) {
        productSer.add(product);
    }

    @Override
    public Product findById(int id) {
        return productSer.findById(id);
    }

    @Override
    public void update(Product product) {
        productSer.update(product);
    }

    @Override
    public void remove(Product product) {
        productSer.remove(product);
    }

    @Override
    public void seachId(Product product) {
        productSer.seachId(product);
    }

    @Override
    public void sort() {
productSer.sort();
    }
}
