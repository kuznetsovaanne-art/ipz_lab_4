package work4.iterator;

import java.util.List;

/**
 * конкретний ітератор для обходу колекції та реалізації методів для доступу до елементів колекції
 */
public class ConcreteIterator implements Iterator {
    private List<Object> collection;
    private int index = 0;

    public ConcreteIterator(List<Object> collection) {
        this.collection = collection;
    }

    /**
     * перевіряє, чи є елементи для обходу
     * @return
     */
    public boolean hasNext() {
        return index < collection.size();
    }

    /**
     * повертає наступний елемент
     * @return
     */
    public Object next() {
        if (this.hasNext()) {
            return collection.get(index++);
        }
        return null;
    }

}
