package homework6.ex1_3;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2012, 10, 28);
        System.out.print("Date 1: ");
        System.out.println(date1);
        System.out.println("next day: " + date1.nextDay());
        System.out.println("next month: " + date1.nextMonth());
        System.out.println("next year: " + date1.nextYear());
        System.out.println(" ");

        System.out.print("Date 2: ");
        MyDate date2 = new MyDate(2001, 2, 16);
        System.out.println(date2);
        System.out.println("previous day: " + date2.previousDay());
        System.out.println("previous month: " + date2.previousMonth());
        System.out.println("previous year: " + date2.previousYear());

    }
}
