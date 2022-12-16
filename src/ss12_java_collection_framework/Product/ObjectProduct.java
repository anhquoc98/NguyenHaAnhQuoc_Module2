package ss12_java_collection_framework.Product;

import ss12_java_collection_framework.Model.Product;

import java.util.Comparator;

public class ObjectProduct {
    int id;
    String NameString;

    public ObjectProduct() {
    }

    public ObjectProduct(int id, String nameString) {
        this.id = id;
        NameString = nameString;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameString() {
        return NameString;
    }

    public void setNameString(String nameString) {
        NameString = nameString;
    }

    @Override
    public String toString() {
        return "ObjectProduct{" +
                "id=" + id +
                ", NameString='" + NameString + '\'' +
                '}';
    }


}
