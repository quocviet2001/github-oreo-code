package lap6.ex1_2;

public class TestMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1);

        Student student1 = new Student("Nguyen Quoc Viet", "Ha Nam", "Toan Tin", 2019, 10.0);
        System.out.println(student1);
        System.out.println("name: " + student1.getName());
        System.out.println("address: " + student1.getAddress());
        System.out.println("program: " + student1.getProgram());
        System.out.println("year: " + student1.getYear());
        System.out.println("fee: " + student1.getFee());

        Staff staff1 = new Staff("Harvard university", 18000.0);
        System.out.println(staff1);

        Staff staff2 = new Staff("Nguyen Chi Dung", "Ha Noi", "Dai Hoc Khoa hoc Tu nhien", 20000.0);
        System.out.println(staff2);
        System.out.println("name: " + staff2.getName());
        System.out.println("address: " + staff2.getAddress());
        System.out.println("school: " + staff2.getSchool());
        System.out.println("pay: " + staff2.getPay());
    }
}
