package lop_va_doi_tuong_java.QuadraticEquation.Class_fan;

public class ClassFan1 {
    final int SLOW =1;
    final int MEDIUM=2;
    final int FAST =3;
    private boolean turn=false ;

    private String color;
    private int speed;
    private double  radius;

    public ClassFan1(){

    }
    public ClassFan1(boolean turn, String color, int speed, double radius){
        this.turn=turn;
        this.color=color;
        this.speed=speed;
        this.radius=radius;
    }

    public boolean getTurn(){
        return this.turn;
    }
    public void setTurn(boolean turn){
        this.turn=turn;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }

    public String toString(){
        if (this.getTurn()){
            return "fan is on,speed :"+this.getSpeed()+"radius :"+getRadius()+"Color :"+this.color;
        }
        else {
            return "fan is off,speed :"+this.getSpeed()+"radius :"+getRadius()+"Color :"+this.color;
        }
    }

}
