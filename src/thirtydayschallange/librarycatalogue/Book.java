package thirtydayschallange.librarycatalogue;

public class Book {
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckOut;
    int daysCheckOut = -1;

    public Book(String title, int pageCount, int ISBN) {
        this.title = title;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isCheckOut() {
        return isCheckOut;
    }

    public void setCheckOut(boolean checkOut) {
        isCheckOut = checkOut;
    }

    public int getDaysCheckOut() {
        return daysCheckOut;
    }

    public void setDaysCheckOut(int daysCheckOut) {
        this.daysCheckOut = daysCheckOut;
    }
}
