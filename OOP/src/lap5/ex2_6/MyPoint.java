package lap5.ex2_6;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] XY = new int[2];
        XY[0] = this.x;
        XY[1] = this.y;
        return XY;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public double distance(int x, int y) {
        int x1 = this.x - x;
        int y1 = this.y - y;
        return Math.sqrt(x1 * x1 + y1 * y1);
    }

    public double distance(MyPoint another) {
        int x1 = this.x - another.x;
        int y1 = this.y - another.y;
        return Math.sqrt(x1 * x1 + y1 * y1);
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}
