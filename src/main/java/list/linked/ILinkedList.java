package list.linked;

public interface ILinkedList {
    void printEachNodeValue();
    void addNodeToHead(int value);
    void addNodeToTail(int value);
    int getValueAtIndex(int index);
    int popTailNode();
    int shiftHeadNode();
    int addNodeAtIndex(int value);
}
