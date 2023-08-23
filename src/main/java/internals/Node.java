package internals;

public class Node {
    int key;
    int height;
    Node left;
    Node right;

    public Node(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return key + "";
    }
}