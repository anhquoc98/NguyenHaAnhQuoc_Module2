package ss17_IOBinary_Serializtion.ManagerProduct.Contror.Repository;

import ss17_IOBinary_Serializtion.ManagerProduct.Contror.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepro implements IProductRepo {
    static final String FILE_PATH="D:\\Codegyme\\module2\\untitled\\src\\ss17_IOBinary_Serializtion\\ProductIOStream.dat";
    public static void writeProduct(List<Product> productList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
            ObjectOutputStream bufferedWriter = new ObjectOutputStream(fileOutputStream);
            bufferedWriter.writeObject(productList);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Product> readerProduct(){
        try {
            FileInputStream fileInputStream=new FileInputStream(FILE_PATH);
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            List<Product> productList1=(List<Product>) objectInputStream.readObject();
            return productList1;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone7", "Apple", 4.0, "RED"));
        productList.add(new Product(2, "Sammsung", "sammsung", 4.0, "Black"));
        productList.add(new Product(3, "Iphone10", "Apple", 5.0, "White"));
        productList.add(new Product(4, "Iphone13", "Apple", 10.0, "Black"));
        productList.add(new Product(5, "Iphone14", "Apple", 15.0, "Blu"));
        writeProduct(productList);
    }

    @Override
    public void add(Product product) {
        productList = readerProduct();
        productList.add(product);
        writeProduct(productList);

    }

    @Override
    public void list() {
        productList = readerProduct();
        for (Product product : productList) {
            System.out.println(product);
        }

    }

    @Override
    public void seach(Product product) {
        productList = readerProduct();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getIdProduct() == product.getIdProduct()) {
                System.out.println(productList.get(i));
            }
        }
    }

    @Override
    public Product findById(int id) {
        productList = readerProduct();
        for (Product c : productList) {
            if (c.getIdProduct() == id) {
                return c;
            }
        }
        return null;
    }
}

