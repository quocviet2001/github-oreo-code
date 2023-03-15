package lap10.ex1_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TestApp {
    public static void main(String[] args) throws ParseException {
        Item i1 = new Book("Sunrise", 2022, 170);
        Item i2 = new Dvd("Moon", 2011, 130);

        Student student1 = new Student("Viet", "Nguyen", "0919564460", 2.7);
        Student student2 = new Student("Hoang", "Tran", "0867860571", 3.5);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Rent[] rents = new Rent[5];
        rents[0] = new Rent(i1, student1, sdf.parse("15/06/2020"), sdf.parse("15/07/2020"));
        rents[1] = new Rent(i1, student2, sdf.parse("10/07/2020"), sdf.parse("20/07/2020"));
        rents[2] = new Rent(i1, student1, sdf.parse("25/08/2020"), sdf.parse("14/11/2020"));
        rents[3] = new Rent(i2, student2, sdf.parse("10/07/2020"), sdf.parse("20/07/2020"));
        rents[4] = new Rent(i2, student1, sdf.parse("25/08/2020"), sdf.parse("28/08/2020"));

        Library l1 = new Library(rents);
        System.out.println(l1.getLongestRent());
    }
}
