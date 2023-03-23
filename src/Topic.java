public class Topic {
    private String title;
    private String topic;
    private String author;
    private String subject;
    private Books books = new Books();


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Books getBooks() {
        return this.books;
    }

    public void setNewBook(Books books) {
        this.books = books;
    }
}

