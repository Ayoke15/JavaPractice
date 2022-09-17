package ex1;

public class ex1 {
    public static void main(String[] args) {
        }
}
interface Movable{
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}
class MovablePoint implements Movable{
    package int x;
    package int y;
    package int xSpeed;
    package int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveDown() {
        x = x-100;

    }

    @Override
    public void moveLeft() {
        y = y-100;
    }

    @Override
    public void moveRight() {
        y=y+100;
    }

    @Override
    public void moveUp() {
        x = x+100;
    }
}
class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
        super(x, y, xSpeed, ySpeed);
        this.radius=radius;
    }
    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    @Override
    public void moveDown() {
        x = x-100;

    }

    @Override
    public void moveLeft() {
        y = y-100;
    }

    @Override
    public void moveRight() {
        y=y+100;
    }

    @Override
    public void moveUp() {
        x = x+100;
    }
}

