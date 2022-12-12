package ss7_truu_tuong.Geometry;

public abstract class HinhHoc implements Resizeable {
    public String color ;

    public HinhHoc(String color) {
        this.color = color;
    }

    public HinhHoc() {
    }

    public String getClolor() {
        return color;
    }

    public void setClolor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "HinhHoc{" +
                "color='" + color + '\'' +
                '}';
    }


}
