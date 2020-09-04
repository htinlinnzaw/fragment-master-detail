package me.proft.fragmentstst;


import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private Integer year;
    public static List<Movie> items = new ArrayList<>();

    public static void generate() {
        items.add(new Movie("The Shawshank Redemption", 1994));
        items.add(new Movie("The Godfather ", 1972));
        items.add(new Movie("The Godfather: Part II ", 1974));
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public Movie(String title, Integer year) {
        this.title = title;
        this.year = year;
    }
}
