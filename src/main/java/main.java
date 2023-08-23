import internals.AVLTree;

import java.util.stream.IntStream;

public class main {

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        IntStream.rangeClosed(1, 500)
                        .forEach(value -> {
                            long start = System.nanoTime();
                            tree.insert(value);
                            long end = System.nanoTime();
                            System.out.println("Time for insertion is " + (end - start));
                        });
        System.out.println("Tree is " + tree.height() + " in height");



    }
}
