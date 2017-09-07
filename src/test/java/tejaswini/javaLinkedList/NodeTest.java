package tejaswini.javaLinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    private Node node;

    @Before
    public void setup() throws Exception {
        node = new Node("hello");
    }

    @Test
    public void shouldSetDataToGivenValue() {
        node.setData("hey");

        assertEquals(new Node("hey").toString(), node.toString());
    }
}