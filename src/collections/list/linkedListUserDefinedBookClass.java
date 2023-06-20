package collections.list;

import java.util.LinkedList;

class Book{
    int id;
    String book_name;
    String book_author;

    Book(int id, String book_name, String book_author){
        this.id = id;
        this.book_name = book_name;
        this.book_author = book_author;
    }

}
public class linkedListUserDefinedBookClass {

    public static void main(String[] args) {
        LinkedList<Book> ls = new LinkedList<>();
        Book b1 = new Book(101,"The Notebook","Nicholas Sparks");
        Book b2 = new Book(102, "The Great Gatsby","F. Scott Fitzgerald.");
        ls.add(b1);
        ls.add(b2);

        for(Book b: ls){
            System.out.println(b.id+" -|- "+b.book_author+" -|- "+b.book_name);
        }

    }
}
