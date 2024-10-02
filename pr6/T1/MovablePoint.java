package pr6.T1;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() { return xSpeed; }
    public int getySpeed() { return ySpeed; }


    @Override
    public String toString() {
        return "MovablePoint (" + this.x + ", "  + this.y  + ")" + " coords and speed (" + this.xSpeed + ", " + this.ySpeed + ")";
    }

    @Override
    public void moveUp() {
        y -= 1;
    }

    @Override
    public void moveDown() {
        y += 1;
    }

    @Override
    public void moveLeft() {
        x -= 1;
    }

    @Override
    public void moveRight() {
        x += 1;
    }
}
