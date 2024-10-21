public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Александр", "Дюма");
        Book book1 = new Book("Евгений Онегин", author1, 2010);
        Book book2 = new Book("Граф Монте-Кристо", author2,2000);
        System.out.println("Автор книги - " + book1.getAuthor().getNameAuthor() + " " + book1.getAuthor().getFamilyAuthor());
        System.out.println("Название книги - " + book1.getTitle());
        book1.setPublishingYear(2015);
        System.out.println("Год публикации - " + book1.getPublishingYear());
        System.out.println(book1);
        System.out.println(author1);
        System.out.println(book1.equals(book2));
        System.out.println(author1.equals(author2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
    }
}