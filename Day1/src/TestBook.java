import java.util.*;

public class TestBook {

    // Static

    public static void display(Book book){

        System.out.println(" Class Book Data "+book.getBookName()+"  :   "+book.getBookPrice()+"  : "+book.getAuthorName());

    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

//        TestBook testBook = new TestBook();
        // Default
        System.out.println(" Enter your book name : ");
        String bookName = sc.nextLine();

        System.out.println("Enter the book price : ");
        int bookPrice = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the author name : ");
        String authorName = sc.nextLine();

        Book book1 = new Book();
        book1.setBookName(bookName);
        book1.setBookPrice(bookPrice);
        book1.setAuthorName(authorName);

        Book book2 = new Book("java",100,"insha");

       display(book1);
        System.out.println();
        display(book2);


    }


}
