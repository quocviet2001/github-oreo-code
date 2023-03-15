package lap7.ex1_5;

public class TestMain {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(8.8);
        System.out.println(resizableCircle);
        resizableCircle.resize(2);
        System.out.println(resizableCircle);
    }
}
