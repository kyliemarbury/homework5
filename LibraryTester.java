public class LibraryTester {
    
    public static void main(String[] agrs){
        BookShelf bookShelfO = new BookShelf();
        BookShelf bookShelfT = new BookShelf();
        bookShelfO.setshelfLetter('O');
        bookShelfT.setshelfLetter('T');
        System.out.println(bookShelfO);
        System.out.println(bookShelfT);
        Book book1 = new Book("The Heart of the Betrayed", " - Crime");
        Book book2 = new Book("Our Hill of Stars", " - Fantasy");
        Book book3 = new Book("One of a kind", " - Science Fiction");
        Book book4 = new Book("The Vision of Roses", " - Romance");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        bookShelfO.addBook(book1);
        bookShelfO.addBook(book2);
        bookShelfO.addBook(book3);
        bookShelfO.addBook(book4);
        bookShelfT.addBook(book1);
        bookShelfT.addBook(book2);
        bookShelfT.addBook(book3);
        bookShelfT.addBook(book4);
        System.out.println(bookShelfO);
        System.out.println(bookShelfT);
    }
}
