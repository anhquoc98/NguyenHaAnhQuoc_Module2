import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList vals = new ArrayList();
        vals.add(3.5);
        vals.add(4.5);
        vals.add(5.5);
        vals.add(vals.set(1,2.5)) ;
        System.out.println(vals);
    }
}