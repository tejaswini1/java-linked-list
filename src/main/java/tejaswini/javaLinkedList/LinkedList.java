package tejaswini.javaLinkedList;

public class LinkedList {

    private Node start;
    private Node end;

    public void add(Object data) {

        Node newNode = new Node(data);

        if (start == null) {
            setStart(newNode);
            setEnd(newNode);
        }
        end.setNextNode(newNode);
        setEnd(newNode);
    }

    public void addAt(Object data, int index) {
        Node currentNode = this.start;
        Node newNode = new Node(data);

        if (index == 0) {
            this.start = newNode;
            return;
        }

        for (int i = 1; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }

        if (currentNode.getNextNode() == null)
            this.end = newNode;

        newNode.setNextNode(currentNode.getNextNode());
        currentNode.setNextNode(newNode);
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getStart() {
        return start;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public Node getEnd() {
        return end;
    }
}
