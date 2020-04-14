package isp.lab1.student;

import java.time.LocalDate;

public interface Book {

    public String getAuthor();

    public String getISBN();

    public int getPages();

    public double getCost();

    public String getFormattedReleaseDate();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getTitle();

    public void order(int quantity);
}
