public class App {
    public static void main(String[] args) throws Exception {
        Topic newTopic = new Topic();

        System.out.println("Title: " + newTopic.getTitle());

        newTopic.setAuthor("Frank Rocha");
        newTopic.setSubject("Programação");
        newTopic.setTitle("Princípios do Código Limpo");

        Books newBook = new Books();
        newBook.setTitle("Código limpo: Habilidades práticas do Agile Software");
        newBook.setYear(2009);
        newBook.setAuthor("Robert C. Martin");
        newBook.changePercentageSolved(74.32);

        newTopic.setNewBook(newBook);

        System.out.println("Title: " + newTopic.getTitle());
        System.out.println("Author: " + newTopic.getAuthor());
        System.out.println("Subject: " + newTopic.getSubject());
        System.out.println("Books: " + newTopic.getBooks());
    }
}
