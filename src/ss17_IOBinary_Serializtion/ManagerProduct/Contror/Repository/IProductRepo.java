package ss17_IOBinary_Serializtion.ManagerProduct.Contror.Repository;

import ss17_IOBinary_Serializtion.ManagerProduct.Contror.model.Product;

public interface IProductRepo {
    void add(Product product);
    void list();
    Product findById(int id);
    void seach(Product product);


}
