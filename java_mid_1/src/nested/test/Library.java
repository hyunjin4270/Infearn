package nested.test;

public class Library {

    
    private Book[] book;
    private int count = 0;
    private final int MAXIMUM;

    
    Library(int books) {
        book = new Book[books];
        MAXIMUM = books;
    }

    void addBook(String title, String author) {
        if (count < MAXIMUM) {
            book[count++] = new Book(title, author);
        } else {
            return;
        }
    }

    public void showBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println("도서 제목 : " + book[i].getTitle() + ", 저자 : " + book[i].getAuthor());
        }
    }

    private static class Book {
        private String title;
        private String author;

        Book (String title, String author) {
            this.title = title;
            this.author = author;
        }
        private String getTitle() {
            return title;
        }

        private String getAuthor() {
            return author;
        }
    }
}
