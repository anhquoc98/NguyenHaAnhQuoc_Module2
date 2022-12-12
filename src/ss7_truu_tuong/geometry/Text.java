package ss7_truu_tuong.geometry;

import ss7_truu_tuong.geometry.HinhHoc;
import ss7_truu_tuong.geometry.Rectangle;
import ss7_truu_tuong.geometry.Square;

public class Text {
    public static void main(String[] args) {
       HinhHoc[] hinhHoc =new HinhHoc[3];
       hinhHoc[0] =new Circle("blue",10);
       hinhHoc[1]=new Rectangle("red",7,5);
       hinhHoc[2]=new Square("pink",5);
        System.out.println("Trước khi thay đổi");
        hinhHoc[0].resize(0);
        hinhHoc[1].resize(0);
        hinhHoc[2].resize(0);
        System.out.println("Sau khi thay đổi");
        hinhHoc[0].resize(Math.floor(Math.random()*100 +1));
        hinhHoc[1].resize(Math.floor(Math.random()*100 +1));
        hinhHoc[2].resize(Math.floor(Math.random()*100 +1));
    }
}
