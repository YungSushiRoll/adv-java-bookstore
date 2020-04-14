package isp.lab1.student;

import java.time.Duration;
import java.time.LocalDate;

public interface Album {

    public String getArtist();

    public Duration getPlayingTime();

    public double getCost();

    public String getFormattedReleaseDate();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getTitle();

    public void order(int quantity);
}
