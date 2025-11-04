package work4.chain_of_responsibility;

/**
 * інтерфейс, що визначає методи для обробки документа
 */
public interface Handler {
    void handle(Document document);
    void setNextHandler(Handler nextHandler);
}
