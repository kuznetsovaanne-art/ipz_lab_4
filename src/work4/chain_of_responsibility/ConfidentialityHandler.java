package work4.chain_of_responsibility;

/**
 * конкретний обробник для перевірки конфіденційності документа
 */
public class ConfidentialityHandler implements Handler{
    private Handler nextHandler;

    /**
     * перевіряє конфіденційність документа
     * @param document
     */
    @Override
    public void handle(Document document) {
        System.out.println("Перевірка конфіденційності документа");
        if (!document.confidential) {
            if (nextHandler != null) nextHandler.handle(document);
        } else {
            System.out.println("Помилка: Документ конфіденційний");
        }
    }

    /**
     * встановлює наступний обробник
     * @param nextHandler
     */
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
