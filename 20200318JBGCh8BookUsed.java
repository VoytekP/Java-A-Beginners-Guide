package bookpackext;

// Use the Book class from bookpack.

import bookpack.Book;

public class UsedBook {
    public static void main(String[] args) {
        bookpack.Book books[] = new bookpack.Book[5];

        books[0] = new Book("Java: A Beginner's Guide", "Schilt", 2019);
        books[1] = new Book("Java: The Complete Reference", "Schildt", 2019);
        books[2] = new Book("Introducing JavaFX 8 Programming", "Schildt", 2019);
        books[3] = new Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new Book("On the Road", "Kerouac", 1955);

        for (int i = 0; i < books.length; i++) books[i].show();
    }
}
