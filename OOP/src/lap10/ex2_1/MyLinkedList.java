package lap10.ex2_1;

public class MyLinkedList extends MyAbstractList{
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public void add(Object o) {
        add(o, size);
    }

    public void add(Object o, int index) {
        checkBoundaries(index,size);
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    public Object get(int index) {
        return this.getNodeByIndex(index).getPayload();
    }

    public void remove(int index) {
        MyLinkedListNode behind = this.getNodeByIndex(index + 1);
        MyLinkedListNode previous = this.getNodeByIndex(index - 1);
        MyLinkedListNode current = this.getNodeByIndex(index);
        previous.setNext(behind);
        current.setNext(null);
        this.size --;
    }
    public int size() {
        return this.size;
    }
}
