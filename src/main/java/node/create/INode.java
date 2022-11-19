package node.create;

public interface INode {
    int getValue();
    void setValue(int value);
    void setNextNode(INode node);
    INode getNextNode();
}
