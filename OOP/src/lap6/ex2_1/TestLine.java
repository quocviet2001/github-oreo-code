package lap6.ex2_1;

public class TestLine {
    public static void main(String[] args) {
        Line line1 = new Line(1, 1, 3, 4);
        System.out.println(line1);

        Point point1 = new Point(2, 3);
        Point point2 = new Point(4, 5);
        Line line2 = new Line(point1, point2);
        System.out.println(line2);
        System.out.println("Begin: " + line2.getBegin());
        System.out.println("End: " + line2.getEnd());
        System.out.println("Length: " + line2.getLength());
        System.out.println("Gradient: " + line2.getGradient());
        line2.setBeginX(7);
        System.out.println("BeginX: " + line2.getBeginX());
        line2.setEndY(8);
        System.out.println("EndY: " + line2.getEndY());
    }
}
