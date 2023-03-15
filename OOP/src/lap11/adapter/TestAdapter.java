package lap11.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(roundHole.fit(roundPeg));

        SquarePeg squarePeg1 = new SquarePeg(5);
        SquarePeg squarePeg2 = new SquarePeg(10);
        RoundPeg adapter1 = new SquarePegAdapter(squarePeg1);
        RoundPeg adapter2 = new SquarePegAdapter(squarePeg2);
        System.out.println(roundHole.fit(adapter1));
        System.out.println(roundHole.fit(adapter2));
    }
}
