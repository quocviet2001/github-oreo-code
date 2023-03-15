package lap8.ex1;

import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 666) {
                list.remove(list.get(i));
            }
        }
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            newList.add(i * i);
        }
        return newList;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        for (int i = 0, j = list.size() - 1; i < j; i++) {
            list.add(i, list.remove(j));
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        insertFirst(list1, 1);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(666);
        insertLast(list1, 9);
        System.out.println(list1);

        removeThird(list1);
        removeEvil(list1);
        System.out.println(list1);

        reverseManual(list1);
        System.out.println(list1);
        reverse(list1);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        copy(list1, list2);
        System.out.println(list2);

        System.out.println(generateSquare());

        LinkedList<Integer> list3 = new LinkedList<Integer>();
        list3.add(3);
        list3.add(4);
        insertBeginningEnd(list3, 7);
        System.out.println(list3);
    }
}
