package ss17_IOBinary_Serializtion.ManagerProduct.Contror.server;

import ss17_IOBinary_Serializtion.ManagerProduct.Contror.model.Product;

public interface IProductSev {
    void add(Product product);
    void list();
    Product findById(int id);
    void search(Product product);
}
