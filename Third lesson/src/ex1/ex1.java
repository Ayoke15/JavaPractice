package ex1;

import java.util.ArrayList;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {
        circle round = new circle(10, 10.5);
        System.out.println("Radius"+ round.getRadius()+"Square" + round.getSquare());
    }
}
class circle{
    int radius;
    double square;
    public circle(int radius, double square){
        this.radius=radius;
        this.square=square;
    }
    public double getSquare() {
        return square;
    }
    public int getRadius() {
        return radius;
    }
    public void setSquare() {
        this.square=square;
    }
    public void setRadius() {
        this.radius=radius;
    }

}
