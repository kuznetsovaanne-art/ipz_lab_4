package work4.chain_of_responsibility;

public interface Handler {
    void handle(Document document);
    void setNextHandler(Handler nextHandler);
}
