package node.create;

public class Node implements INode{
    int value;
    INode node;

    public Node(int value) {
        this.value = value;
        this.node = null;
    }
    public Node(int value, INode node) {
        this.value = value;
        this.node = node;
    }
    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void setNextNode(INode node) {
        this.node = node;
    }

    @Override
    public INode getNextNode() {
        return node;
    }
}
