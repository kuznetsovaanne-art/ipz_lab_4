package work4.chain_of_responsibility;

import java.time.LocalDateTime;

public class SubmissionTimeHandler implements Handler{
    private Handler nextHandler;

    @Override
    public void handle(Document document) {
        System.out.println("Перевірка часу подання документа");
        if (document.submissionTime.isBefore(LocalDateTime.now())) {
            System.out.println("Документ успішно перевірено");
        } else {
            System.out.println("Помилка: Невірний час подання");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
