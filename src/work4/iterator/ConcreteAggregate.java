package work4.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate{
    private List<Object> collection = new ArrayList<>();

    public void addElement(Object element) {
        collection.add(element);
    }

    public Iterator createIterator() {
        return new ConcreteIterator(collection);
    }
}
