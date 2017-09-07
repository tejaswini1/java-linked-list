package tejaswini.javaLinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

        LinkedList list;

    @Before
    public void setup() throws Exception{
        list =  new LinkedList();
        list.add("Hello");

    }

    @Test
    public void shouldSetStartAndEndVariablesToFisrtNewObject () {
        assertEquals(list.getEnd(), list.getStart());
    }

    @Test
    public void shouldSetEndVariablesToNewObject () {
        list.add("hey");

        assertEquals(list.getEnd().toString(), new Node("hey").toString());
        assertEquals(list.getStart().toString(), new Node("Hello").toString());
    }

    @Test
    public void shouldSetEndAndStartValueAccordingly(){
        list.add(1234);
        list.add("world");

        list.addAt(3L, 3);

        assertEquals(list.getEnd().toString(), new Node(3L).toString());
        assertEquals(list.getStart().toString(), new Node("Hello").toString());

        list.addAt("abcd", 2);

        assertEquals(list.getEnd().toString(), new Node(3L).toString());
        assertEquals(list.getStart().toString(), new Node("Hello").toString());

        list.addAt("first", 0);

        assertEquals(list.getEnd().toString(), new Node(3L).toString());
        assertEquals(list.getStart().toString(), new Node("first").toString());

    }

}