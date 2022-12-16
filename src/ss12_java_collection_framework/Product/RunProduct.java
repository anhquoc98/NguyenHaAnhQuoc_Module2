package ss12_java_collection_framework.Product;

import ss12_java_collection_framework.Model.Product;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class RunProduct {
    public static void main(String[] args) {
        System.out.println("Quản lý sản phẩm ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cập Nhập sản phẩm :");
        int select = 0;
        ObjectProduct objectProduct1 =new ObjectProduct(1,"Iphone6");
        ObjectProduct objectProduct2 =new ObjectProduct(2,"Iphone7");
        ObjectProduct objectProduct3 =new ObjectProduct(3,"Iphone8");
        ObjectProduct objectProduct4 =new ObjectProduct(4,"IphoneX");
        ObjectProduct objectProduct5 =new ObjectProduct(5,"IphoneXr");
        ObjectProduct objectProduct6 =new ObjectProduct(6,"Iphone11 ProMax");
        ObjectProduct objectProduct7 =new ObjectProduct(7,"Iphone12");
        ArrayList<ObjectProduct> arrayList =new ArrayList();
        arrayList.add(objectProduct1);
        arrayList.add(objectProduct2);
        arrayList.add(objectProduct3);
        arrayList.add(objectProduct4);
        arrayList.add(objectProduct5);
        arrayList.add(objectProduct6);
        arrayList.add(objectProduct7);
       System.out.println(arrayList.size());


        do {
            System.out.println("-----Product Manager-------");
            System.out.println("1. List");
            System.out.println("2. Add");
            System.out.println("3. Remove id");
            System.out.println("4. Seach id");
            System.out.println("5. Sort Up");
            System.out.println("6. Sort dowm");
            System.out.println("7. Fix id");
            System.out.println("8. Exit");
            select =Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    for (int i = 0; i <arrayList.size() ; i++) {
                        System.out.println(arrayList.get(i).toString());
                    }
                case 2:
                    System.out.println("Mời bạn nhập Id :");
                    int number =Integer.parseInt(scanner.nextLine());
                    System.out.println("Mời bạn nhập sản phẩm");
                    String productName =scanner.nextLine();
                    ObjectProduct objectProduct =new ObjectProduct(number,productName);
                    arrayList.add(objectProduct);
                case 3:
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.remove(objectProduct1.getId(i));
                    }
            }
        } while (true);
    }
}
