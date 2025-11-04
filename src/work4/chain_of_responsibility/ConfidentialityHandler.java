package work4.chain_of_responsibility;

public class ConfidentialityHandler implements Handler{
    private Handler nextHandler;

    @Override
    public void handle(Document document) {
        System.out.println("Перевірка конфіденційності документа");
        if (!document.confidential) {
            if (nextHandler != null) nextHandler.handle(document);
        } else {
            System.out.println("Помилка: Документ конфіденційний");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
