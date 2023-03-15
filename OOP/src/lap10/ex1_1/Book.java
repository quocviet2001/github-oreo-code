package lap10.ex1_1;

public class Book extends Item {
    int page;

    public Book(String title, int year, int page) {
        super(title, year);
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book[" + "page="
                + page + super.toString() + "]";
    }
}
