package homework6.ex1_2;

public class TestMyTime {
    public static void main(String[] args) {
        System.out.print("My time: ");
        MyTime myTime = new MyTime(23, 59, 59);
        System.out.println(myTime);
        System.out.print("next second: ");
        System.out.println(myTime.nextSecond());
        System.out.print("next minute: ");
        System.out.println(myTime.nextMinute());
        System.out.print("next hour: ");
        System.out.println(myTime.nextHour());
        System.out.println(" ");

        System.out.print("Another time: ");
        MyTime myTime1 = new MyTime(9, 19, 58);
        System.out.println(myTime1);
        System.out.print("next second: ");
        System.out.println(myTime1.nextSecond());
        System.out.print("next minute: ");
        System.out.println(myTime1.nextMinute());
        System.out.print("next hour: ");
        System.out.println(myTime1.nextHour());
        System.out.println(" ");

        System.out.println("Previous time: ");
        System.out.print("Time: ");
        MyTime myTime2 = new MyTime();
        System.out.println(myTime2);
        System.out.print("previous second: ");
        System.out.println(myTime2.previousSecond());
        System.out.println("previous minute: " + myTime2.previousMinute());
        System.out.println("previous hour: " + myTime2.previousHour());
    }
}
