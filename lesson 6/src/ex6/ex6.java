package ex6;

public class ex6 {
}
interface Movable{
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
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
        y = y - ySpeed;

    }

    @Override
    public void moveLeft() {
        x=x-xSpeed;
    }

    @Override
    public void moveRight() {
        x=x+xSpeed;
    }

    @Override
    public void moveUp() {
        y = y+ySpeed;
    }
    public boolean equals(MovablePoint point){
        if (this.xSpeed == point.xSpeed && this.ySpeed == point.ySpeed){
            return true;
        }
        else return false;
    }
}

class MovableRectangle extends MovablePoint{

    double width;
    double length;
    public MovableRectangle(int x, int y, int xSpeed, int ySpeed,double width,double length){
        super(x,y,xSpeed,ySpeed);
        this.width=width;
        this.length=length;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter(){

        return width * 2 + length * 2;
    }

    public double getArea(){

        return width * length;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public void moveDown() {
        width=width - ySpeed;
    }
    @Override
    public void moveLeft() {
        length=length-xSpeed;
    }

    @Override
    public void moveRight() {
        length=length+xSpeed;
    }

    @Override
    public void moveUp() {
        width = width+ySpeed;
    }


}
