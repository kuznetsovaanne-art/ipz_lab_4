package work4.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * конкретна реалізація колекції, що надає метод для створення ітератора
 */
public class ConcreteAggregate implements Aggregate{
    private List<Object> collection = new ArrayList<>();

    /**
     * додавання елементв до колекції
     * @param element
     */
    public void addElement(Object element) {
        collection.add(element);
    }

    /**
     * створює ітератор для колекції
     * @return
     */
    public Iterator createIterator() {
        return new ConcreteIterator(collection);
    }
}
