package lap10.ex2_1;

public class TestApp {
    public static void main(String[] args) {
        MyList list = new MyArrayList();
        list.add("a", 0);
        list.add("b" );
        list.add("c", 0);
        list.add("c", 3);
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list);
    }
}
