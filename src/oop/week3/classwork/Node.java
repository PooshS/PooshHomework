package oop.week3.classwork;

import java.util.List;

/**
 * Created by Poosh on 19.09.2017.
 */
public class Node {

    int val;
    String name;
    List<Node> junior;

    public Node(int val, String name, List<Node> junior) {
        this.val = val;
        this.name = name;
        this.junior = junior;
    }
}
