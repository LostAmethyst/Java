public class Book {
    private String title;
    private String author;
    private int pages;
    private int year;

    public Book(String title, String author, int pages, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Book1", "Author1", 100, 2015),
                new Book("Book2", "Author2", 150, 2012),
                new Book("Book3", "Author3", 200, 2019),
                new Book("Book4", "Author4", 250, 2011),
                new Book("Book5", "Author5", 300, 2013)
        };

        for (Book book : books) {
            if (book.getAuthor().contains("A") && book.getYear() >= 2010 && isPrime(book.getPages())) {
                System.out.println(book.getTitle());
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
