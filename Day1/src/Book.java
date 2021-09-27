public class Book {

    private String bookName;

    private int bookPrice;

    private String authorName;

    // Default c
    Book(){

    }

    // Para c
    Book(String bookName,int bookPrice,String authorName){
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.authorName = authorName;

    }


    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getBookName(){
        return this.bookName;
    }


}
