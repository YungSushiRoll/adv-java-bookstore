package isp.lab2.student;

import java.time.Duration;

public interface Album extends Product {

    public String getArtist();

    public Duration getPlayingTime();
}
