package work4.chain_of_responsibility;

import java.time.LocalDateTime;

public class Document {
    String name;
    String format;
    String author;
    boolean confidential;
    LocalDateTime submissionTime;

    public Document(String name, String format, String author, boolean confidential, LocalDateTime submissionTime) {
        this.name = name;
        this.format = format;
        this.author = author;
        this.confidential = confidential;
        this.submissionTime = submissionTime;
    }
}
