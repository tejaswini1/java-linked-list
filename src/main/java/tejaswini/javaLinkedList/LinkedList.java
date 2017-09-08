package tejaswini.javaLinkedList;

public class LinkedList<T> {

    private Node start;
    private Node end;

    public void add(T data) {

        Node newNode = new Node(data);

        if (start == null) {
            setStart(newNode);
            setEnd(newNode);
        }
        end.setNextNode(newNode);
        setEnd(newNode);
    }

    public void addAt(T data, int index) {
        Node currentNode = this.start;
        Node newNode = new Node(data);

        if (index == 0) {
            setStart(newNode);
            return;
        }

        for (int i = 1; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }

        if (currentNode.getNextNode() == null)
            setEnd(newNode);

        newNode.setNextNode(currentNode.getNextNode());
        currentNode.setNextNode(newNode);
    }

    private void setStart(Node start) {
        this.start = start;
    }

    public Node getStart() {
        return start;
    }

    private void setEnd(Node end) {
        this.end = end;
    }

    public Node getEnd() {
        return end;
    }
}
