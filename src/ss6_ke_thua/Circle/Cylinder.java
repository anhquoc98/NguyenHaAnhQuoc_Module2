package ss6_ke_thua.Circle;

public class Cylinder extends Circle {
    private float chieuCao;

    public float getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }

    public Cylinder(float r, String color, float chieuCao) {
        super(r, color);
        this.chieuCao = chieuCao;
    }

    public Cylinder(float chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "h=" + chieuCao + super.toString()+
                '}';
    }
}
