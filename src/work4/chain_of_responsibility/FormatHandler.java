package work4.chain_of_responsibility;

/**
 * конкретний обробник для перевірки формату документа
 */
public class FormatHandler implements Handler{
    private Handler nextHandler;

    /**
     * первіряє формат документа
     * @param document
     */
    @Override
    public void handle(Document document) {
        System.out.println("Перевірка формату документа");
        if (document.format.equals("PDF")) {
            if (nextHandler != null) nextHandler.handle(document);
        } else {
            System.out.println("Помилка: Невірний формат документа");
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
