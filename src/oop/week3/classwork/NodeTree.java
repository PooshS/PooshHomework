package oop.week3.classwork;

import sun.plugin.javascript.navig.Array;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Poosh on 19.09.2017.
 */
public class NodeTree {

    public static void main(String[] args) {

        Node eight = new Node(8, "eight", null);
        Node seven = new Node(5, "seven", null);
        Node six = new Node(10, "six", null);
        Node five = new Node(15, "five", null);
        Node four = new Node(20, "four", null);
        Node three = new Node(25, "three", Arrays.asList(six, seven, eight));
        Node two = new Node(30, "two", Arrays.asList(four, five));
        Node one = new Node(35, "one", Arrays.asList(two, three));

        System.out.println("calculateSum = " + calculateSum(one));
        System.out.println("findMin = " + findMin(one).name + " -> " + findMin(one).val);
        System.out.println("printTree = " + printTree(one));
        System.out.println("findMax = " + findMax(one).name + " -> " + findMax(one).val);
        findMinMaxAndSwap(one);
        System.out.println("findMinMaxAndSwap ==>> " + printTree(one));
    }

    public static int calculateSum(Node root){
        
        int sum = root.val;

        List <Node> juniors = root.junior;

        if(juniors == null){
            return sum;
        }

        for (Node junior : juniors) {
            int curRes = calculateSum(junior);
            sum = sum + curRes;
        }

        return sum;
    }

    public static Node findMin(Node root){

        Node minNode = root;
        int min = root.val;

        List <Node> juniors = root.junior;

        if(juniors == null){
            return root;
        }

        for (Node junior : juniors) {
            Node curNode = findMin(junior);
            int curRes = curNode.val;
            if (curRes < min){
                min = curRes;
                minNode = curNode;
            }
        }

        return minNode;

    }

    public static String printTree(Node root){

        String nameAndVal = root.name + "->" + root.val;

        List <Node> juniors = root.junior;

        if(juniors == null){
            return nameAndVal;
        }

        for (Node junior : juniors) {
            String curRes = printTree(junior);
            nameAndVal = nameAndVal + " " + curRes;
        }

        return nameAndVal;

    }


    public static Node findMax(Node root){

        Node maxNode = root;
        int max = root.val;

        List <Node> juniors = root.junior;

        if(juniors == null){
            return root;
        }

        for (Node junior : juniors) {
            Node curNode = findMax(junior);
            int curRes = curNode.val;
            if (curRes > max){
                max = curRes;
                maxNode = curNode;
            }
        }

        return maxNode;

    }

    public static void findMinMaxAndSwap(Node root){

        Node min = findMin(root);
        Node max = findMax(root);
        int tmpVal = max.val;
        String tmpName = max.name;
        max.val = min.val;
        max.name = min.name;
        min.val = tmpVal;
        min.name = tmpName;

    }

}
