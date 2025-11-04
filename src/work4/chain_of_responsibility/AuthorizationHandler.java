package work4.chain_of_responsibility;

public class AuthorizationHandler implements Handler{
    private Handler nextHandler;

    @Override
    public void handle(Document document) {
        System.out.println("Перевірка авторизації користувача");
        if (document.author != null) {
            if (nextHandler != null) nextHandler.handle(document);
        } else {
            System.out.println("Помилка: Авторизація не пройдена");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
