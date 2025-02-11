package Chuong2.Bai2_1_2;

import java.util.Arrays;

public class BookAdvenced {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0 ;
    public BookAdvenced(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public BookAdvenced(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString() {
        return "BookAdvenced [name=" + name + " , authors { Author"+ Arrays.toString(authors) +"}" +
                ",price=" + price + ",qty=" + qty + "]";
    }
    public String getAuthorName() {
        return Arrays.toString(authors);
    }
}
