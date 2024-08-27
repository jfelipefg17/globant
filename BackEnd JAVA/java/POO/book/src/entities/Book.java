package entities;

public class Book {
    private int ISBN;
    private String tittle;
    private String author;
    private int numberPages;

    public Book () {}

    public Book(int ISBN, String tittle, String author, int numberPages) {
        this.ISBN = ISBN;
        this.tittle = tittle;
        this.author = author;
        this.numberPages = numberPages;
    }

    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public String getTittle() {
        return tittle;
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getNumberPages() {
        return numberPages;
    }
    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", numberPages=" + numberPages +
                '}';
    }
}
