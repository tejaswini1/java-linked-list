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
