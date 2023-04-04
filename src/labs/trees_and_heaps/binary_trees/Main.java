package labs.trees_and_heaps.binary_trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
     * Expected output:
     *
     * [4, 2, 5, 1, 3]
     * [1, 2, 4, 5, 3]
     * [4, 5, 2, 3, 1]
     * [3, 1, 5, 4, 2]
     * [1, 2, 3, 4, 5]
     */
    public static void main(String[] args) {
        BinaryTree<String> one = new BinaryTree<>("1");
        BinaryTree<String> two = new BinaryTree<>("2");
        BinaryTree<String> three = new BinaryTree<>("3");
        BinaryTree<String> four = new BinaryTree<>("4");
        BinaryTree<String> five = new BinaryTree<>("5");

        one.setLeft(two);
        two.setLeft(four);
        two.setRight(five);

        one.setRight(three);

        List<String> values = one.inOrder();
        System.out.println(values);

        values = one.preOrder();
        System.out.println(values);

        values = one.postOrder();
        System.out.println(values);

        List<BinaryTree<String>> trees = new ArrayList<>();
        trees.add(three);
        trees.add(one);
        trees.add(five);
        trees.add(four);
        trees.add(two);

        System.out.println(trees);

        Collections.sort(trees);
        System.out.println(trees);
    }
}
