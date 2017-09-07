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

        assertNotEquals(list.getEnd(), list.getStart());
    }

}