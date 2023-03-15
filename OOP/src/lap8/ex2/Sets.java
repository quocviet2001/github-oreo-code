package lap8.ex2;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> results = new HashSet<Integer>();
        for (Integer firsts : first) {
            for (Integer seconds : second) {
                if (firsts == seconds) {
                    results.add(firsts);
                }
            }
        }
        return results;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> results = new HashSet<Integer>();
        for (Integer firsts : first) {
            results.add(firsts);
        }
        for (Integer seconds : second) {
            results.add(seconds);
        }
        return results;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        first.retainAll(second);
        return new HashSet<Integer>((HashSet<Integer>)first);
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        first.addAll(second);
        return first;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new LinkedList<Integer>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new HashSet<Integer>(source);
        return new ArrayList<Integer>(set);
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        for (Integer i : source) {
            if (!(results.contains(i))) {
                results.add(i);
            }
        }
        return results;
    }

    public static String firstRecurringCharacter(String s) {
        return Character.toString(s.charAt(0));
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> results = new HashSet<Character>();
        char temp[] = s.toCharArray();
        for (char i : temp) {
            results.add(i);
        }
        return results;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return (Integer[]) source.toArray();
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.ceiling(value);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        System.out.println(set1);
        Set<Integer> set3 = new HashSet<Integer>(set1);
        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(2);
        set2.add(5);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        System.out.println(set2);
        System.out.println(intersectionManual(set1, set2));
        System.out.println(unionManual(set1, set2));
        System.out.println(toList(set2));

        List<Integer> source = new ArrayList<Integer>();
        source.add(1);
        source.add(3);
        source.add(5);
        source.add(7);
        source.add(0);
        System.out.println(removeDuplicatesManual(source));

        String s = "JavaProgram";
        System.out.println(firstRecurringCharacter(s));
        System.out.println(allRecurringChars(s));

        System.out.println(intersection(set1, set2));
        System.out.println((union(set3, set2)));

    }
}
