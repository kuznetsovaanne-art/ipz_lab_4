package work4.chain_of_responsibility;

/**
 * конкретний обробник для перевірки авторизації користувача
 */
public class AuthorizationHandler implements Handler{
    private Handler nextHandler;

    /**
     * первіряє аворизацію користувача
     * @param document
     */
    @Override
    public void handle(Document document) {
        System.out.println("Перевірка авторизації користувача");
        if (document.author != null) {
            if (nextHandler != null) nextHandler.handle(document);
        } else {
            System.out.println("Помилка: Авторизація не пройдена");
        }
    }

    /**
     * встановлює наствупний обробник
     * @param nextHandler
     */
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
