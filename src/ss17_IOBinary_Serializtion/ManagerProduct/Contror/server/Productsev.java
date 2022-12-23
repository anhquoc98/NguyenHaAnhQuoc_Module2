package ss17_IOBinary_Serializtion.ManagerProduct.Contror.server;

import ss17_IOBinary_Serializtion.ManagerProduct.Contror.Repository.ProductRepro;
import ss17_IOBinary_Serializtion.ManagerProduct.Contror.model.Product;

public class Productsev implements IProductSev {
    ProductRepro productRepro = new ProductRepro();

    @Override
    public void add(Product product) {
        productRepro.add(product);
    }

    @Override
    public void list() {
        productRepro.list();
    }

    @Override
    public Product findById(int id) {
        return productRepro.findById(id);
    }

    @Override
    public void search(Product product) {
        productRepro.seach(product);
    }
}
