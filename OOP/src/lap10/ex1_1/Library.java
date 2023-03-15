package lap10.ex1_1;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Rent longest = rents[0];
        for (int i = 1; i < rents.length; i++) {
            if(rents[i].getDiff() >= longest.getDiff()) {
                longest = rents[i];
            }
        }
        return longest;
    }
}
