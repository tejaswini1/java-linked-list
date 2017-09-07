package tejaswini.javaLinkedList;

public class Node {

    private Object data;
    private Node nextNode;

    public Node(Object data, Node nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public Node(Object data) {
        this.data = data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public String toString(){
            return "data = "+ this.data;

    }
}
