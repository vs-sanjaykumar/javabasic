import java.util.*;
class Book{
    private String name;
    private String author;
    private static ArrayList<Book> bookcollection =new ArrayList<Book>();

    public Book (String name,String author){
        this.name=name;
        this.author=author;
    }
    
    public void set_name(String name){
        this.name=name;
    }
    public void set_author(String author){
        this.author=author;
    }
    public String get_name(){
        return this.name;
    }
    public String get_author(){
        return this.author;
    }

    public static void addBook(Book book){
        bookcollection.add(book);
    }
    public static void removeBook(Book book){
        bookcollection.remove(book);
    }
    public static ArrayList<Book> get_collection(){
        return bookcollection;
    }

}

class Main{
    public static void main(String[] args) {
        Book book1=new Book("secrete","rhonda");
        Book book2=new Book("alchemist","jhon");
        Book book3=new Book("abcd","sanjay");
        Book book4=new Book("1234","kumar");
        Book.addBook(book2);
        Book.addBook(book1);
        Book.addBook(book3);
        Book.addBook(book4);
        ArrayList<Book> bookcollection=Book.get_collection();
        for(Book book:bookcollection){
            System.out.printf("\nTitle : %s and Author : %s \n",book.get_name(),book.get_author());
        }
    }
}