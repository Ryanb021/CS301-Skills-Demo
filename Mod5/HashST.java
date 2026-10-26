import java.util.ArrayList;

public class HashST<Key, Value> {
    public static void main(String[] args) {

        // Create a hash symbol table
        HashST<String, Integer> st = new HashST<String, Integer>();

        // Add some values
        st.put("Goku", 1000);
        st.put("Vegeta", 900);
        st.put("Piccolo", 700);

        // Test contains()
        System.out.println("Contains Goku: " + st.contains("Goku"));
        System.out.println("Contains Gohan: " + st.contains("Gohan"));

        // Test size()
        System.out.println("Size: " + st.size());

        // Test keys()
        System.out.println("Keys:");

        for (String key : st.keys()) {
            System.out.println(key);
        }
    }

    // Number of linked lists
    private int m = 1024;

    // Array to store linked lists
    private Node[] lists = new Node[m];

    // Node class to store keys and values
    private static class Node {

        Object key;
        Object val;
        Node next;

        // Constructor
        public Node(Object key, Object val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    // Find the hash index
    private int hash(Key key) {
        return Math.abs(key.hashCode() % m);
    }

    // Get the value of a key
    @SuppressWarnings("unchecked")
    public Value get(Key key) {

        int i = hash(key);

        for (Node x = lists[i]; x != null; x = x.next) {

            if (key.equals(x.key)) {
                return (Value) x.val;
            }
        }

        return null;
    }

    // Add a key and value
    public void put(Key key, Value val) {

        int i = hash(key);

        for (Node x = lists[i]; x != null; x = x.next) {

            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }

        lists[i] = new Node(key, val, lists[i]);
    }

    // Check if a key exists
    public boolean contains(Key key) {

        if (get(key) != null) {
            return true;
        }

        return false;
    }

    // Count the number of keys
    public int size() {

        int count = 0;

        for (int i = 0; i < m; i++) {

            Node x = lists[i];

            while (x != null) {
                count++;
                x = x.next;
            }
        }

        return count;
    }

    // Return all keys
    @SuppressWarnings("unchecked")
    public Iterable<Key> keys() {

        ArrayList<Key> allKeys = new ArrayList<Key>();

        for (int i = 0; i < m; i++) {

            Node x = lists[i];

            while (x != null) {
                allKeys.add((Key) x.key);
                x = x.next;
            }
        }

        return allKeys;
    }
}