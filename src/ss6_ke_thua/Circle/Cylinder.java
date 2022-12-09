package ss6_ke_thua.Circle;

import ss6_ke_thua.Circle.Circle;

public class Cylinder extends Circle {
    private float h;

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public Cylinder(float r, String color, float h) {
        super(r, color);
        this.h = h;
    }

    public Cylinder(float h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "h=" + h + super.toString()+
                '}';
    }
}
