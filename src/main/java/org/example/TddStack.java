package org.example;

import java.util.ArrayList;
import java.util.List;

public class TddStack {
    private final List<String> elements = new ArrayList<>();

    public void push(String element) {
        elements.add(element);
    }

    public int getSize() {
        return elements.size();
    }

    public String pop() {
        if(getSize() == 0) {
            throw new IllegalStateException();
        }

        return elements.remove(elements.size()-1 );
    }

    public String peek() {
        if (getSize() == 0)
            return null;
        return elements.get(elements.size() - 1 );
    }
}
