package work4.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator {
    private List<Object> collection;
    private int index = 0;

    public ConcreteIterator(List<Object> collection) {
        this.collection = collection;
    }

    public boolean hasNext() {
        return index < collection.size();
    }

    public Object next() {
        if (this.hasNext()) {
            return collection.get(index++);
        }
        return null;
    }

}
