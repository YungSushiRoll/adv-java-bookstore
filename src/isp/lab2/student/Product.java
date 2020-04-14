package isp.lab2.student;

import java.time.LocalDate;

public interface Product {

    public double getCost();

    public String getFormattedReleaseDate();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getTitle();

    public void order(int quantity);
}
