package OopPackage;


public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setYear(year);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        if (year > 0 && year < 2024)
            this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return "Title: %s, Author: %s, Year: %d\n".formatted(this.title, this.author.toString(), this.year);
    }

}
