package lap5.ex2_1;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan An Teck", "anteck@nowhere.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }
}
