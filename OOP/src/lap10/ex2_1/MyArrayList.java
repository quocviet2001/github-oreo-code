package lap10.ex2_1;

public class MyArrayList extends MyAbstractList{
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    public void add(Object object, int index) {
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = object;
        size++;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        elements[size - 1] = null;
        this.size--;
    }

    public int size() {
        return this.size;
    }
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }
    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0,elements.length);
        elements = tmp;
    }
}
