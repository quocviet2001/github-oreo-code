package lap6.ex2_1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub lineSub = new LineSub(1, 3, 5, 6);
        System.out.println(lineSub);

        lineSub.setBegin(new Point(10, 20));
        lineSub.setEnd(new Point(15, 22));

        System.out.println(lineSub);
        System.out.println("begin is: " + lineSub.getBegin());
        System.out.println("end is: " + lineSub.getEnd());

        lineSub.setBeginX(33);
        lineSub.setBeginY(44);
        lineSub.setEndX(55);
        lineSub.setEndY(66);
        System.out.println(lineSub);
        System.out.println("begin's x is: " + lineSub.getBeginX());
        System.out.println("begin's y is: " + lineSub.getBeginY());
        System.out.println("end's x is: " + lineSub.getEndX());
        System.out.println("end's y is: " + lineSub.getEndY());

        lineSub.setBeginXY(77, 88);
        lineSub.setEndXY(99, 100);
        System.out.println(lineSub);
        System.out.println("begin's x is: " + lineSub.getBeginXY()[0]);
        System.out.println("begin's y is: " + lineSub.getBeginXY()[1]);
        System.out.println("end's x is: " + lineSub.getEndXY()[0]);
        System.out.println("end's y is: " + lineSub.getEndXY()[1]);
        
        System.out.println("Length: " + lineSub.getLength());
        System.out.println("Gradient: " + lineSub.getGradient());
    }
}
