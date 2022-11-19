package test;

import node.create.INode;
import node.create.Node;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        INode myNode = new Node(60);

        System.out.println("My new shiny node~!: " + myNode);
        System.out.println("My shiny node's value~! " + myNode.getValue());
        System.out.println("But does it have a next node?? " + myNode.getNextNode());

        myNode.setNextNode(new Node(70));

        System.out.println("How about now??? " + myNode.getNextNode());

        System.out.println("Did it have a value??? " + myNode.getNextNode().getValue());
    }
}