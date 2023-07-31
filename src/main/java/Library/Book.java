package Library;

public class Book {
    public int sNo;
    public String bookName;
    public String authorName;
    public int bookQty;

    public Book() {
    }

    public Book(int sNo, String bookName, String authorName, int bookQty) {
        sNo = sNo;
        bookName = bookName;
        authorName = authorName;
        bookQty = bookQty;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBookQty() {
        return bookQty;
    }

    public void setBookQty(int bookQty) {
        this.bookQty = bookQty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "sNo=" + sNo +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookQty=" + bookQty +
                '}';
    }
}
