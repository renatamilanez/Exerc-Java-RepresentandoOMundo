public class Books {
    private String title;
    private String author;
    private int year;
    private double percentageSolved;

    void changePercentageSolved(double newPercentage) {
        this.percentageSolved = newPercentage;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPercentage() {
        return this.percentageSolved;
    }
}
