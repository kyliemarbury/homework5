import java.util.ArrayList;

public class BookShelf{
    public char shelfLetter;
    public ArrayList<Book> books;

    //default constructor 
    public BookShelf(){
        books = new ArrayList<>();
    }
    // getter and setter for shelfletter
    public char getshelfLetter(){
        return shelfLetter;
    }
    public void setshelfLetter(char shelfLetter){
        this.shelfLetter = shelfLetter;
    }
    // method to add Book to the shelf 
    public void addBook(Book book){
        if(book.getTitle().charAt(0) == shelfLetter){
            if(books.size() < 8){
                books.add(book);
                //System.out.println("Book added to the shelf.");
            } else{
                //System.out.println("Shelf is full, cannot add more books.");
            }
        } else{
            //System.out.println("Book not appropriate for this shelf");
        }
    }
    // removes a book from the shelf
    public void removeBook(Book book){
        books.remove(book);
        //System.out.println("Book removed from the shelf.");
    }
    public String toString(){
        String output = "";
        if(books.isEmpty()){
            return "Empty";
        }
        else{
            for(int i = 0; i < books.size(); i++){
                output += books.get(i)+"   ";
            }
        }
        return output; 
    }
    // public static void (String[] args){ //dont need 
       // BookShelf shelf = new BookShelf();
       // System.out.println("Books on the shelf: " + shelf);
}