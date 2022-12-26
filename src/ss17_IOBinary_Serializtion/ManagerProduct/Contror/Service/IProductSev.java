package ss17_IOBinary_Serializtion.ManagerProduct.Contror.Service;

import ss17_IOBinary_Serializtion.ManagerProduct.Contror.Model.Product;

public interface IProductSev {
    void add(Product product);
    void list();
    Product findById(int id);
    void search(Product product);
}
