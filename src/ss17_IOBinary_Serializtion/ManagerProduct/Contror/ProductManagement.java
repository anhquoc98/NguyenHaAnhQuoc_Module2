package ss17_IOBinary_Serializtion.ManagerProduct.Contror;

import ss17_IOBinary_Serializtion.ManagerProduct.Contror.model.Product;
import ss17_IOBinary_Serializtion.ManagerProduct.Contror.server.Productsev;

import java.util.Scanner;

public class ProductManagement {



    public static void main(String[] args) {

        System.out.println("Quản lý sản phẩm");
        Scanner scanner= new Scanner(System.in);
        Productsev productSev =new Productsev();

        int select =0;
        do {
            System.out.println("----------Product Manager------------");
            System.out.println("1.List Product");
            System.out.println("2.Add Product");
            System.out.println("3.SeachId Product");
            System.out.println("4.Exit");
            select =Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    productSev.list();
                    break;
                case 2:
                    System.out.println("Mời bạn nhập id:");
                    int id =Integer.parseInt(scanner.nextLine());
                    System.out.println("Mời bạn nhập sản phẩm:");
                    String newProduct =scanner.nextLine();
                    System.out.println("Nhập hảng sản phẩm:");
                    String placeOfProduct=scanner.nextLine();
                    System.out.println("Nhập tiền sản phâm:");
                    double price =Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập màu sản phẩm:");
                    String colorProduct =scanner.nextLine();
                    Product product =new Product(id,newProduct,placeOfProduct,price,colorProduct);
                    productSev.add(product);
                    break;
                case 3:
                    System.out.println("seach id:");
                    int seachId =Integer.parseInt(scanner.nextLine());
                    Product product1 =productSev.findById(seachId);
                    if (product1 !=null) {
                        System.out.println(product1);
                    }
                    else {
                        System.out.println("không tìm thấy sản phẩm");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("");
            }
        }while (true);
    }
}
