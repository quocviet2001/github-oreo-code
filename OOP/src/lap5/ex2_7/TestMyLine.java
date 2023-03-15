package lap5.ex2_7;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint begin = new MyPoint(3, 0);
        MyPoint end = new MyPoint(0, 4);

        MyLine line1 = new MyLine(begin, end);
        System.out.println(line1);
        System.out.println("Begin: " + line1.getBegin());
        System.out.println("End: " + line1.getEnd());
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());
        line1.setBeginX(7);
        System.out.println("BeginX: " + line1.getBeginX());
        line1.setEndY(1);
        System.out.println("EndY: " + line1.getEndY());
    }
}
