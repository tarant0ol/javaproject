package pr6.T2;

import pr6.T1.Movable;
import pr6.T1.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }


    @Override
    public void moveUp() {
        if (this.topLeft.getxSpeed() == this.bottomRight.getxSpeed() && this.topLeft.getySpeed() == this.bottomRight.getySpeed()){
            topLeft.moveUp();
            bottomRight.moveUp();
        } else {
            System.err.println("Rectangle is broken");
        }
    }

    @Override
    public void moveDown() {
        if (this.topLeft.getxSpeed() == this.bottomRight.getxSpeed() && this.topLeft.getySpeed() == this.bottomRight.getySpeed()){
            topLeft.moveDown();
            bottomRight.moveDown();
        } else {
            System.err.println("Rectangle is broken");
        }
    }

    @Override
    public void moveLeft() {
        if (this.topLeft.getxSpeed() == this.bottomRight.getxSpeed() && this.topLeft.getySpeed() == this.bottomRight.getySpeed()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        } else {
            System.err.println("Rectangle is broken");
        }
    }

    @Override
    public void moveRight() {
        if (this.topLeft.getxSpeed() == this.bottomRight.getxSpeed() && this.topLeft.getySpeed() == this.bottomRight.getySpeed()){
            topLeft.moveRight();
            bottomRight.moveRight();
        } else {
            System.err.println("Rectangle is broken");
        }
    }
}
