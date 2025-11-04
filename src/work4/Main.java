package work4;

/**
 * клас, що демонструє роботу обох шаблонів
 */
public class Main {
    /**
     * демонструє обидва шаблони
     * @param args
     */
    public static void main(String[] args) {
        // Завдання 1: Iterator
        System.out.println("Завдання 1: Iterator");
        work4.iterator.ConcreteAggregate aggregate = new work4.iterator.ConcreteAggregate();
        aggregate.addElement("Apple");
        aggregate.addElement("Banana");
        aggregate.addElement("Cherry");

        work4.iterator.Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Завдання 2: Chain of Responsibility
        System.out.println("\nЗавдання 2: Chain of Responsibility");
        work4.chain_of_responsibility.Document document = new work4.chain_of_responsibility.Document("Report", "PDF", "John Doe", false, java.time.LocalDateTime.now().minusDays(1));

        work4.chain_of_responsibility.Handler formatHandler = new work4.chain_of_responsibility.FormatHandler();
        work4.chain_of_responsibility.Handler authorizationHandler = new work4.chain_of_responsibility.AuthorizationHandler();
        work4.chain_of_responsibility.Handler confidentialityHandler = new work4.chain_of_responsibility.ConfidentialityHandler();
        work4.chain_of_responsibility.Handler submissionTimeHandler = new work4.chain_of_responsibility.SubmissionTimeHandler();

        formatHandler.setNextHandler(authorizationHandler);
        authorizationHandler.setNextHandler(confidentialityHandler);
        confidentialityHandler.setNextHandler(submissionTimeHandler);

        formatHandler.handle(document);
    }
}