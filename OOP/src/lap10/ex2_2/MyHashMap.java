package lap10.ex2_2;

public class MyHashMap implements MyMap {
    final static int INITIAL_SIZE = 8;
    MyHashMapEntry[] table;
    int size = 0;

    public MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
    }

    int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    public Object get(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return table[bucket].getValue();
        }
        return -1;
    }

    public void put(Object key, Object value) {
        if (capacityRadio() > 0.6) {
            enlarge();
        }
        int bucket = getBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    public void remove(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            table[bucket] = null;
            size--;
        }
    }

    public boolean contains(Object o) {
        return table[getBucket(o)] != null;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> (%s, %s)\n", i,
                        table[i].getKey(), table[i].getValue()));
            }
        }
        return sb.toString();
    }

    double capacityRadio() {
        return size / (double) table.length;
    }

    void enlarge() {
        MyHashMapEntry[] tmp = new MyHashMapEntry[table.length * 2];
        System.arraycopy(table, 0, tmp, 0,table.length);
        table = tmp;
    }
}
