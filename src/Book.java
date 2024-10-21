public class Book {
    private String title;
    private Author author;
    private int publishingYear;
    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getTitle() {
        return title;
    }
    public  Author getAuthor() {
        return author;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public String toString() {
        return "Название книги - " + this.title + ", Автор - " + this.author + ", год издания - " + this.publishingYear;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        if (title != book.title) {
            return false;
        } else if (publishingYear != book.publishingYear) {
            return false;
        }
        return author == book.author;
    }

    public int hashCode() {
        int result = 10;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + publishingYear;
        return result;
    }
}
