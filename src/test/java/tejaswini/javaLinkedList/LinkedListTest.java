package tejaswini.javaLinkedList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.mock;

@RunWith(PowerMockRunner.class)
@PrepareForTest(LinkedList.class)
public class LinkedListTest {

    private LinkedList<String> list;
    private Node mockNode;


    @Before
    public void setup() throws Exception{
        list =  new LinkedList<String>();
        list.add("Hello");

    }

    @Test
    public void shouldSetStartAndEndVariablesToFisrtNewObject() {

        assertEquals(list.getEnd(), list.getStart());
    }

    @Test
    public void shouldSetEndVariablesToNewObject() throws Exception {
        list.add("hey");

        assertEquals(list.getEnd().toString(), new Node("hey").toString());
        assertEquals(list.getStart().toString(), new Node("Hello").toString());
    }

    @Test
    public void shouldSetEndValueAccordingly() {
        list.add("1234");
        list.add("world");

        list.addAt("it works", 3);

        assertEquals(list.getEnd().toString(), new Node("it works").toString());
        assertEquals(list.getStart().toString(), new Node("Hello").toString());


    }

    @Test
    public void shouldNotUpdateEndAndStartValue() {

        list.add("1234");
        list.add("world");
        list.add("ehd");
        list.addAt("abcd", 2);

        assertEquals(list.getEnd().toString(), new Node("ehd").toString());
        assertEquals(list.getStart().toString(), new Node("Hello").toString());

    }

    @Test
    public void shouldSetStartValueAccordingly() {

        list.add("1234");
        list.add("world");
        list.add("world");
        list.add("world");

        list.addAt("first", 0);

        assertEquals(list.getEnd().toString(), new Node("world").toString());
        assertEquals(list.getStart().toString(), new Node("first").toString());
    }
    @Test
    public void shouldNotUpdateEndValueIfExceptionOccurs() {

        list.add("1234");
        list.addAt("first", 4);

        assertEquals(list.getEnd().toString(), new Node("1234").toString());
        assertEquals(list.getStart().toString(), new Node("Hello").toString());
    }

    @Test
    public void dummyTestForMock() throws Exception{
        Node mockNode = mock(Node.class);

        PowerMockito.whenNew(Node.class)
                .withAnyArguments().thenReturn(mockNode);

        list.addAt("first", 0);

    }
}