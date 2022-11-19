package list.linked;

import node.create.INode;

public class LinkedListConcrete implements ILinkedList{
    private INode head;
    private INode tail;
    private int size;

    public LinkedListConcrete() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void printEachNodeValue() {

    }

    @Override
    public void addNodeToHead(int value) {

    }

    @Override
    public void addNodeToTail(int value) {

    }

    @Override
    public int getValueAtIndex(int index) {
        return 0;
    }

    @Override
    public int popTailNode() {
        return 0;
    }

    @Override
    public int shiftHeadNode() {
        return 0;
    }

    @Override
    public int addNodeAtIndex(int value) {
        return 0;
    }
}
