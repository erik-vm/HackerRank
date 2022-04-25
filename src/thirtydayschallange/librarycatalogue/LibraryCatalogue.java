package thirtydayschallange.librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    Map<String, Book> bookCollection = new HashMap<>();
    int currentDay = 0;
    int lengthOfCheckOutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerDayLate = 1.00;

    public LibraryCatalogue(Map<String, Book> bookCollection, int lengthOfCheckOutPeriod, double initialLateFee, double feePerDayLate) {
        this.bookCollection = bookCollection;
        this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerDayLate = feePerDayLate;
    }

    public LibraryCatalogue(Map<String, Book> bookCollection) {
        new LibraryCatalogue(bookCollection, lengthOfCheckOutPeriod, initialLateFee, feePerDayLate);
    }

    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public int getLengthOfCheckOutPeriod() {
        return lengthOfCheckOutPeriod;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public double getFeePerDayLate() {
        return feePerDayLate;
    }

    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

    public void checkOutBook(String title) {
        Book book = getBook(title);
        if (book.isCheckOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setCheckOut(true);
            System.out.println("You just checked out " + title + ". Its due is " + getCurrentDay() + getLengthOfCheckOutPeriod());
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDaysCheckOut() + getLengthOfCheckOutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the library " + (getInitialLateFee()) + daysLate * getFeePerDayLate() + ", because your book is " + daysLate + " days overdue.");
        } else {
            System.out.println("Book returned. Thank you!");
        }
        book.setCheckOut(false);
    }

    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry! " + book.getTitle() + " is already checked out. Its should be back on day " + (book.getDaysCheckOut() + getLengthOfCheckOutPeriod()) + ".");
    }

    public static void main(String[] args) {
        Map<String, Book> bookMap = new HashMap<>();
        LibraryCatalogue libraryCatalogue = new LibraryCatalogue(bookMap);
        Book HarryPotter = new Book("Harry Potter", 123213, 9999);
        bookMap.put("Harry Potter",HarryPotter);

        libraryCatalogue.checkOutBook("Harry Potter");
        libraryCatalogue.nextDay();
        libraryCatalogue.nextDay();
    }
}
