public class Book {
    String title;
    Author author;
    int year;

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

    static class Main {
        public static void main(String[] args) throws Exception {
            Author author = new Author("Alexander Pushkin", "male", "pushkin.alex@duelloser.ru");
            Book book = new Book("Captain's daughter", author, 1836);

            System.out.printf("%s, %s, %s\n\n", author.getName(), author.getGender(), author.getEmail());
            System.out.printf("%s, %s, %s\n\n", book.getTitle(), book.getAuthor().toString(), book.getYear());

            System.out.println(author.toString());
            System.out.println();
            System.out.println(book.toString());
        }
    }
}
