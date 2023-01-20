package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {

    @Test
    void initialTest() {
        var newStack = new TddStack();
        assertNotEquals(null, newStack);
    }

    @Test
    void addToStack() {
        var newStack = new TddStack();
        newStack.push("asdasasd");
    }

    @Test
    void newStackSizeIsZero() {
        var newStack = new TddStack();
        assertEquals(0, newStack.getSize());
    }

    @Test
    void pushToStackIncrementsSize() {
        var newStack = new TddStack();
        newStack.push("bananas");

        assertEquals(1, newStack.getSize());
    }

    @Test
    void canPopFromNonEmptyStack() {
        var newStack = new TddStack();
        newStack.push("element");

        newStack.pop();
    }

    @Test
    void whenStackIsEmptyPopThrowsException() {
        var newStack = new TddStack();
        assertThrows(IllegalStateException.class, newStack::pop);
    }

    @Test
    void popDecrementsSize() {
        var newStack = new TddStack();
        newStack.push("asd");
        newStack.pop();

        assertEquals(0, newStack.getSize());
    }

    @Test
    void canPopPushedElement() {
        var newStack = new TddStack();
        var element = "new Element";

        newStack.push(element);
        var poppedElement = newStack.pop();
        assertEquals(element, poppedElement);
    }

    @Test
    void canPopAndPushTwoElements() {
        var newStack = new TddStack();
        var firstElement = "element 1";
        var secondElement = "element 2";

        newStack.push(firstElement);
        newStack.push(secondElement);

        assertEquals(secondElement, newStack.pop());
        assertEquals(firstElement, newStack.pop());
    }

    @Test
    void peekFromEmptyStackIsNull() {
        var newStack = new TddStack();
        var element = newStack.peek();
        assertNull(element);
    }

    @Test
    void canPeekPushedElement() {
        var newStack = new TddStack();
        var firstElement = "element 1";

        newStack.push(firstElement);

        var peekedElement = newStack.peek();

        assertEquals(firstElement, peekedElement);
    }

    @Test
    void peekDoesNotRemoveElementsFromList() {
        var newStack = new TddStack();
        var firstElement = "element 1";

        newStack.push(firstElement);
        newStack.peek();

        assertEquals(1, newStack.getSize());

        var poppedElement = newStack.pop();
        assertEquals(firstElement, poppedElement);
    }
}
