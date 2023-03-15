package lap8.ex4_2;

import java.io.*;
import java.util.*;

class Movie implements Comparable<Movie> {

    private String name;
    private double rating;
    private int year;

    public int compareTo(Movie movie) {
        if (this.year > movie.year) {
            return 1;
        }
        if (this.year < movie.year) {
            return -1;
        } else {
            return 0;
        }
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}
