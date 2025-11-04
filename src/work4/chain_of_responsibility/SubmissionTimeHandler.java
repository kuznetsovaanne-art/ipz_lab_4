package work4.chain_of_responsibility;

import java.time.LocalDateTime;

/**
 * конкретний обробник для перевірки часу подання документа
 */
public class SubmissionTimeHandler implements Handler{
    private Handler nextHandler;

    /**
     * перевіряє час подання
     * @param document
     */
    @Override
    public void handle(Document document) {
        System.out.println("Перевірка часу подання документа");
        if (document.submissionTime.isBefore(LocalDateTime.now())) {
            System.out.println("Документ успішно перевірено");
        } else {
            System.out.println("Помилка: Невірний час подання");
        }
    }

    /**
     * встановлює нааступний обробник
     * @param nextHandler
     */
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
