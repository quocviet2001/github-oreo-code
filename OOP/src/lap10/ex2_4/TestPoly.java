
package lap10.ex2_4;

import java.util.*;

public class TestPoly {

    public static ArrayPoly createArrayPoly(int[] coeffs) {
        return new ArrayPoly(coeffs);
    }

    public static ListPoly createListPoly(int[] coeffs) {
        return new ListPoly(coeffs);
    }

    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        return array;
    }

    public static void main(String[] args) {
        List<AbstractPoly> polyList = new ArrayList<AbstractPoly>();
        for (int i = 0; i < 5; i++) {
            polyList.add(createArrayPoly(createRandomArray(5)));
        }
        for (int i = 0; i < 5; i++) {
            polyList.add(createListPoly(createRandomArray(5)));
        }

        for (int i = 0; i < polyList.size(); i++) {
            double x = Math.random() * 100 + 1;
            System.out.println("Poly " + (i + 1));
            System.out.println(polyList.get(i));
            System.out.println(polyList.get(i).derivative());
            System.out.println(x);
            System.out.println(polyList.get(i).evalueate(x));
            if (polyList.get(i).getClass().getSimpleName().equals("ArrayPoly"))
                System.out.println(((ArrayPoly) polyList.get(i)).type());
            else
                System.out.println(((ListPoly) polyList.get(i)).type());
        }
        System.out.println();
    }
}
