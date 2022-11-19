package node.create;

// TODO: research how to restrict types generally.
public class Node implements INode{
    private int value;
    private INode nextNode;

    public Node(int value) {
        this.value = value;
        this.nextNode = null;
    }
    public Node(int value, INode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
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
        this.nextNode = node;
    }

    @Override
    public INode getNextNode() {
        return nextNode;
    }
}
