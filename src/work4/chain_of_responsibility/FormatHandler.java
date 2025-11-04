package work4.chain_of_responsibility;

public class FormatHandler implements Handler{
    private Handler nextHandler;

    @Override
    public void handle(Document document) {
        System.out.println("Перевірка формату документа");
        if (document.format.equals("PDF")) {
            if (nextHandler != null) nextHandler.handle(document);
        } else {
            System.out.println("Помилка: Невірний формат документа");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
